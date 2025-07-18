class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length, res=0, min = prices[0];
        // n
        for(int i=1; i<n; i++){
            res = Math.max(prices[i]-min, res);
            min = Math.min(min, prices[i]);
        }
        // n^2;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         res = Math.max(res, prices[j]-prices[i]);
        //     }
        // }
        return res;
    }
}
