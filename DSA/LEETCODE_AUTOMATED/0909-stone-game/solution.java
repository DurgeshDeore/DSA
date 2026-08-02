class Solution {
    public boolean stoneGame(int[] piles) {
        // approach 1: use simulation
        // int l=0, r=piles.length-1, scoreA = 0, scoreB = 0;
        // while(l<r){
        //     if(piles[l] >= piles[r]){
        //         scoreA += piles[l];
        //         l+=1;
        //     }else{
        //         scoreA += piles[r];
        //         r-=1;
        //     }
        //     if(piles[l] >= piles[r]){
        //         scoreB += piles[l];
        //         l+=1;
        //     }else{
        //         scoreB += piles[r];
        //         r-=1;
        //     }
        // }
        // return scoreA >= scoreB;
        return true;
    }
}
