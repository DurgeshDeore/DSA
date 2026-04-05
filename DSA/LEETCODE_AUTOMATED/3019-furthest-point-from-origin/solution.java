class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0, r=0, u=0, d=0, max=0, n=moves.length();
        for(char c: moves.toCharArray()){
            if(c == 'L') l+=1;
            else if(c == 'R') r+=1;
            // else if(c == 'U') u+=1;
            // else if(c == 'D') d+=1;
            max = Math.max(Math.max(r, u), max);
        }
        int rem = n-(l+r);
        return (l>r)? (l-r)+rem: (r-l)+rem;

    }
}
