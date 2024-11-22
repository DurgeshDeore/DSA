//method = two min Max varibles 
class Solution {
    public int maximumProfit(int prices[]) {
        int maxProfit=0, minValue=Integer.MAX_VALUE;
        for(int price: prices){
            minValue = minValue<price? minValue: price;
            int prof = price-minValue;
            maxProfit = maxProfit>prof? maxProfit:prof;
        }
        return maxProfit;
    }
}
