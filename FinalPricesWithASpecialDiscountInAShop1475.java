//use stack for optimized code
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length-1;
        for(int i=0; i<n+1; i++){
            int dis=0;
            for(int j=i+1; j<prices.length;j++){
                if(prices[i] >= prices[j]){
                    prices[i] = prices[i] - prices[j];
                    dis=prices[j];
                    break;
                }
                prices[i] = prices[i] - dis;
            }
        }
        return prices;
    }
}
