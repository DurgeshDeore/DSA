class Solution {
    public int maxProfit(int[] prices) {
        int maxProf=0;
        int cur = prices[0];
        for(int i: prices){
            maxProf = Math.max(maxProf, (i-cur));
            cur = Math.min(cur, i);
        }
        return maxProf;
    }
}
