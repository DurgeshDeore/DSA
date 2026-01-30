class Solution {
    public int minimumMoves(String s) {
        int pos = 0, res=0;
        for(int i=0; i<s.length();){
            char c = s.charAt(i);
            if(c == 'X'){
                res += 1;
                i += 3;
            }else{
                i++;
            }
        }
        return res;
    }
}
