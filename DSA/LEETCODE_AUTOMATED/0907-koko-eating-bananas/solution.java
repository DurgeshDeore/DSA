class Solution {
    public boolean isValid(int[] piles, int h, int k){
        int totalHr = 0;
        for(int p: piles){
            totalHr += (p+k-1)/k;
        }
        return totalHr <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length, min = piles[0], max = piles[0];
        for(int p: piles){ //find the range 
            // min = Math.min(min, p);
            max = Math.max(max, p);
        }
        int l=1, r=max;
        while(l<r){ // use bs to find correct time
            int m = l+(r-l)/ 2;
            if(isValid(piles, h, m)){
                r=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}
