class Solution {
    public int balancedStringSplit(String s) {
        int r=0, l=0, res=0;
        for(char c: s.toCharArray()){
            if(c == 'R') r+=1;
            else l+=1;
            if(r==l && r!=0) res+=1;
        }
        return res;
    }
}
