class Solution {
    public int numberOfSubstrings(String s, int k) {
        int[] freq = new int[26];
        int l=0, r=0, invalid=0, n=s.length();
        while(r<n){
            freq[s.charAt(r)-'a']++;
            while(freq[s.charAt(r)-'a'] >= k){
                freq[s.charAt(l)-'a']--;
                l++;
            }
            invalid += (r-l)+1;
            r++;
        }
        int total = n* (n+1)/2;
        return total-invalid;
    }
}
