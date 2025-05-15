class Solution {
    public long countSubstrings(String s, char c) {
        int res = 0;
        for(char ch: s.toCharArray()){
            if(ch == c){
                res++;
            }
        }
        return (long)res*(res+1)/2;
    }
}
