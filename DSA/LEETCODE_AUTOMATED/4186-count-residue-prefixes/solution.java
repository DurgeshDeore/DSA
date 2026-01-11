class Solution {
    public int residuePrefixes(String s) {
        int[] freq = new int[26];
        int distinct=0, res=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(freq[c-'a'] == 0){
                distinct++;
            }
            freq[c-'a']++;
            int len = i+1;
            if(distinct == len%3) res+= 1;
        }
        return res;
    }
}
