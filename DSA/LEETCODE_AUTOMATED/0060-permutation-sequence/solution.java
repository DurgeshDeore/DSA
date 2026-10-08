class Solution {
    public ArrayList<String> permutaions;
    public HashSet<String> set;

    public void helper(StringBuilder sb, int l, int r) {
        if (l == r) {
            if (!set.contains(sb.toString()))
                permutaions.add(sb.toString());
            set.add(sb.toString());
            return;
        }
        for (int i = l; i <= r; i++) {
            char c = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(l));
            sb.setCharAt(l, c);
            helper(sb, l + 1, r);
            c = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(l));
            sb.setCharAt(l, c);
        }
    }

    public int getFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    public String getPermutation(int n, int k) {
        // Brute force:
        // TLE (24/200)
        // StringBuilder sb = new StringBuilder();
        ArrayList<Integer> nums = new ArrayList<>();
        StringBuilder res = new StringBuilder();
        // for(int i=1; i<n+1; i++) sb.append(i);
        // if(k == 1) return sb.toString();
        // permutaions = new ArrayList<>();
        // set = new HashSet<>();
        // helper(sb, 0, n-1);
        // Collections.sort(permutaions);
        // return permutaions.get(k-1);
        for (int i = 1; i <= n; i++)
            nums.add(i);
        // if(k==1) return sb.toString();
        int rem = k - 1;

        for (int i = 0; i < n; i++) {
            int fact = getFact((n - i) - 1);
            int indx = (rem / fact);
            rem = (rem % fact);
            res.append(nums.get(indx));
            nums.remove(indx);
        }
        return res.toString();
    }
}
