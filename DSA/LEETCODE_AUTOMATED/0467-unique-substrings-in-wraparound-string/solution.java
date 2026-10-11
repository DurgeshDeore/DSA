class Solution {
    public int findSubstringInWraproundString(String s) {
        int n = s.length(), curLen=1, res = 0;
        if(n == 1) return 1;
        int[] len = new int[26];
        for(int i=0; i<n; i++){
            if(i > 0 && (s.charAt(i)-s.charAt(i-1) == 1 || s.charAt(i-1)-s.charAt(i) == 25))
                curLen += 1;
            else
                curLen = 1;
            len[s.charAt(i)-'a'] = Math.max(len[s.charAt(i)-'a'], curLen);
            // res = Math.max(res, len[s.charAt(i)-'a']);
        }
        for(int l: len) res += l;
        return res;
    }
}
