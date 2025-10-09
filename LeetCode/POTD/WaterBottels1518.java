class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = 0;
        while(numBottles >= numExchange){
            res += numBottles;
            int rem = numBottles%numExchange;
            int empty = numBottles/numExchange;
            numBottles = rem+empty;
        }
        if(numBottles == numExchange)
            res += numBottles/numExchange;;
        return res;
        
        // return numBottles + (numBottles-1)/(numExchange-1);
    }
}
