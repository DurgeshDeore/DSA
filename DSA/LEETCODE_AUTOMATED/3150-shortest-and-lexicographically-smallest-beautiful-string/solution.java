class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int cnt = 0, n=s.length();
        StringBuilder sb = new StringBuilder();
        for(int l=0, r=0; r<n; r++){
            if(s.charAt(r) == '1') cnt += 1;
            while(cnt > k && l <= r) {
                if(s.charAt(l) == '1') cnt -= 1;
                l++;
            }
            while(cnt == k && s.charAt(l) == '0' && l < r) l++;
            if(cnt == k) {
                String cur = s.substring(l, r+1);
                
                if(sb.length() == 0 || (sb.length() > cur.length()) || (sb.length() == cur.length() && cur.compareTo(sb.toString()) < 0)) sb = new StringBuilder(cur);
            }
        }
        return sb.toString();
    }
}
