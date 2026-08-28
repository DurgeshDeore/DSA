#!/usr/bin/env python3
"""
sync_leetcode.py

Fetches your recently ACCEPTED LeetCode submissions and writes any new ones
into this repo, organized as:

    <difficulty>/<id>-<slug>/
        solution.<ext>
        README.md

Designed to run inside GitHub Actions on a schedule, but works fine locally
too. Requires two env vars (see README.md for how to get them):

    LEETCODE_SESSION   - value of the "LEETCODE_SESSION" cookie
    LEETCODE_CSRF_TOKEN - value of the "csrftoken" cookie

Usage:
    python sync_leetcode.py
"""

import json
import os
import re
import sys
import time
import urllib.request
import urllib.error

LEETCODE_GRAPHQL_URL = "https://leetcode.com/graphql"
SUBMISSIONS_LIMIT = int(os.environ.get("LEETCODE_SYNC_LIMIT", "20"))
STATE_FILE = "synced_submissions.json"

# Maps LeetCode's language names to file extensions
LANG_EXTENSIONS = {
    "python": "py",
    "python3": "py",
    "c": "c",
    "cpp": "cpp",
    "csharp": "cs",
    "java": "java",
    "javascript": "js",
    "typescript": "ts",
    "php": "php",
    "swift": "swift",
    "kotlin": "kt",
    "dart": "dart",
    "golang": "go",
    "ruby": "rb",
    "scala": "scala",
    "rust": "rs",
    "racket": "rkt",
    "erlang": "erl",
    "elixir": "ex",
    "mysql": "sql",
    "mssql": "sql",
    "oraclesql": "sql",
    "postgresql": "sql",
}


def get_session():
    """Build an authenticated urllib opener using the LeetCode cookies."""
    session_cookie = os.environ.get("LEETCODE_SESSION")
    csrf_token = os.environ.get("LEETCODE_CSRF_TOKEN")

    if not session_cookie or not csrf_token:
        print(
            "ERROR: LEETCODE_SESSION and LEETCODE_CSRF_TOKEN must be set as "
            "environment variables (or GitHub Secrets).",
            file=sys.stderr,
        )
        sys.exit(1)

    return session_cookie, csrf_token


def graphql_request(query, variables, session_cookie, csrf_token):
    payload = json.dumps({"query": query, "variables": variables}).encode("utf-8")
    req = urllib.request.Request(
        LEETCODE_GRAPHQL_URL,
        data=payload,
        method="POST",
        headers={
            "Content-Type": "application/json",
            "Referer": "https://leetcode.com",
            "Origin": "https://leetcode.com",
            "Cookie": f"LEETCODE_SESSION={session_cookie}; csrftoken={csrf_token}",
            "x-csrftoken": csrf_token,
            "User-Agent": "Mozilla/5.0 (leetcode-sync script)",
        },
    )
    try:
        with urllib.request.urlopen(req, timeout=30) as resp:
            return json.loads(resp.read().decode("utf-8"))
    except urllib.error.HTTPError as e:
        print(f"ERROR: LeetCode API returned {e.code}: {e.read().decode()}", file=sys.stderr)
        sys.exit(1)


def fetch_recent_accepted_submissions(session_cookie, csrf_token, limit=SUBMISSIONS_LIMIT):
    """
    Uses LeetCode's recentAcSubmissionList query. This returns basic info
    (title, slug, timestamp) but NOT the actual code, so we fetch each
    submission's code separately via submissionDetails.
    """
    query = """
    query recentAcSubmissions($username: String!, $limit: Int!) {
        recentAcSubmissionList(username: $username, limit: $limit) {
            id
            title
            titleSlug
            timestamp
            lang
        }
    }
    """
    # username isn't strictly required when authenticated via cookie for
    # some LeetCode endpoints, but the schema wants it. We pull it from the
    # session via the userStatus query first.
    username = fetch_username(session_cookie, csrf_token)
    variables = {"username": username, "limit": limit}
    data = graphql_request(query, variables, session_cookie, csrf_token)

    if "errors" in data:
        print(f"ERROR fetching submissions: {data['errors']}", file=sys.stderr)
        sys.exit(1)

    return data["data"]["recentAcSubmissionList"]


def fetch_username(session_cookie, csrf_token):
    query = """
    query globalData {
        userStatus {
            username
            isSignedIn
        }
    }
    """
    data = graphql_request(query, {}, session_cookie, csrf_token)
    status = data.get("data", {}).get("userStatus", {})
    if not status.get("isSignedIn"):
        print(
            "ERROR: Not signed in — your LEETCODE_SESSION / LEETCODE_CSRF_TOKEN "
            "cookies are likely expired. Grab fresh ones from your browser.",
            file=sys.stderr,
        )
        sys.exit(1)
    return status["username"]


def fetch_submission_code(submission_id, session_cookie, csrf_token):
    """Fetch the actual submitted code for a given submission id."""
    query = """
    query submissionDetails($submissionId: Int!) {
        submissionDetails(submissionId: $submissionId) {
            code
            lang {
                name
            }
            question {
                questionId
                titleSlug
                title
                difficulty
                content
            }
        }
    }
    """
    variables = {"submissionId": int(submission_id)}
    data = graphql_request(query, variables, session_cookie, csrf_token)
    if "errors" in data or not data.get("data", {}).get("submissionDetails"):
        print(f"WARNING: could not fetch details for submission {submission_id}, skipping.")
        return None
    return data["data"]["submissionDetails"]


def slugify(text):
    text = re.sub(r"[^a-zA-Z0-9\-]+", "-", text).strip("-").lower()
    return text


def load_state():
    if os.path.exists(STATE_FILE):
        with open(STATE_FILE, "r") as f:
            return set(json.load(f))
    return set()


def save_state(synced_ids):
    with open(STATE_FILE, "w") as f:
        json.dump(sorted(synced_ids), f, indent=2)


def strip_html(html):
    """Very light HTML-to-text cleanup for problem descriptions."""
    text = re.sub(r"<[^>]+>", "", html or "")
    text = text.replace("&nbsp;", " ").replace("&lt;", "<").replace("&gt;", ">")
    text = text.replace("&amp;", "&").replace("&quot;", '"')
    return text.strip()


def write_solution(details):
    question = details["question"]
    difficulty = question["difficulty"]  # Easy / Medium / Hard
    q_id = question["questionId"]
    slug = question["titleSlug"]
    title = question["title"]
    lang_name = details["lang"]["name"].lower().replace(" ", "")
    ext = LANG_EXTENSIONS.get(lang_name, "txt")

    folder = os.path.join(difficulty, f"{q_id}-{slug}")
    os.makedirs(folder, exist_ok=True)

    solution_path = os.path.join(folder, f"solution.{ext}")
    with open(solution_path, "w") as f:
        f.write(details["code"])

    readme_path = os.path.join(folder, "README.md")
    problem_text = strip_html(question.get("content", ""))
    with open(readme_path, "w") as f:
        f.write(f"# {q_id}. {title}\n\n")
        f.write(f"**Difficulty:** {difficulty}\n\n")
        f.write(f"[View on LeetCode](https://leetcode.com/problems/{slug}/)\n\n")
        f.write("## Problem\n\n")
        f.write(problem_text[:3000])  # keep it reasonable
        if len(problem_text) > 3000:
            f.write("\n\n...(truncated, see link above for full statement)")
        f.write("\n")

    return folder


def main():
    session_cookie, csrf_token = get_session()
    synced_ids = load_state()

    print("Fetching recent accepted submissions...")
    submissions = fetch_recent_accepted_submissions(session_cookie, csrf_token)

    new_count = 0
    for sub in submissions:
        sub_id = sub["id"]
        if sub_id in synced_ids:
            continue

        print(f"New accepted submission found: {sub['title']} ({sub['lang']})")
        details = fetch_submission_code(sub_id, session_cookie, csrf_token)
        if details is None:
            continue

        folder = write_solution(details)
        print(f"  -> wrote {folder}")
        synced_ids.add(sub_id)
        new_count += 1

        # Be polite to LeetCode's API
        time.sleep(1)

    save_state(synced_ids)

    if new_count == 0:
        print("No new accepted submissions. Nothing to commit.")
    else:
        print(f"Synced {new_count} new solution(s).")

    # Signal to the workflow whether there's anything new (used to skip
    # empty commits)
    gh_output = os.environ.get("GITHUB_OUTPUT")
    if gh_output:
        with open(gh_output, "a") as f:
            f.write(f"new_count={new_count}\n")


if __name__ == "__main__":
    main()
