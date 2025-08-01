class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0, mul=1;
        for(int i=columnTitle.length()-1; i>=0; i--){
            int val = (int)columnTitle.charAt(i)-'A'+1;
            res += val* mul;
            mul *= 26;
        }
        return res;
    }
}
