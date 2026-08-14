class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length(), maxLen = 0;
        int[] freq = new int[26];
        for(int r=0, l=0; r<n; r++){
            freq[s.charAt(r)-'a'] += 1;
            while(l <= r && freq[s.charAt(r)-'a'] > 2){
                freq[s.charAt(l)-'a'] -= 1;
                l += 1;
            }
            maxLen = Math.max(maxLen, (r-l)+1);
        }
        return maxLen;
    }
}
