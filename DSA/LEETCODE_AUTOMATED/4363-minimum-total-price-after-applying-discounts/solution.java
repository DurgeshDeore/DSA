class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        int i=0;
        double res = 0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        for (i = 0; i < prices.length / 2; i++) {
            int temp = prices[i];
            prices[i] = prices[prices.length - 1 - i];
            prices[prices.length - 1 - i] = temp;
        }
        for (i = 0; i < discounts.length / 2; i++) {
            int temp = discounts[i];
            discounts[i] = discounts[discounts.length - 1 - i];
            discounts[discounts.length - 1 - i] = temp;
        }
        for(i=0; i<Math.min(prices.length, discounts.length); i++){
            res += (double) prices[i] * (100-discounts[i])/100;
        }
        for(; i<prices.length; i++){ //add rem
            res += prices[i];
        }
        return res;
    }
}
