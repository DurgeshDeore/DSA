class Solution {
    public boolean judgeCircle(String moves) {
        int l=0, r=0, u=0, d=0;
        for(char c: moves.toCharArray()){
            if(c == 'L') l+=1;
            else if(c == 'R') r+=1;
            else if(c == 'U') u+=1;
            else if(c == 'D') d+=1;
        }
        return (l == r) && (u == d);
    }
}
