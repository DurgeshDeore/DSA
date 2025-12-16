class Solution {
    
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        long res = 1, cnt = 1;
        for(int i=1; i<n; i++){
            if(prices[i-1] == prices[i]+1)
                cnt += 1;
            else
                cnt = 1;
            res += cnt;
        }
        // res += n;
        return res;
    }
}
