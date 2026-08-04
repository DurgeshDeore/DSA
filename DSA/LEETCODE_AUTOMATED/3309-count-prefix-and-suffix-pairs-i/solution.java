class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int res = 0, n = words.length;
        // approach 1: Brute force - String.startsWith
        for(int i=0; i<n; i++){
            String pat = words[i];
            for(int j=i+1; j<n; j++){
                String str = words[j];
                if((str.startsWith(pat) == true )&& (str.endsWith(pat) == true)) res += 1;
            }
        }
        return res;
    }
}
