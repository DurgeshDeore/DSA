class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // int res = 0;
        // while(numBottles >= numExchange){
        //     res += numBottles;
        //     int rem = numBottles%numExchange;
        //     int empty = numBottles/numExchange;
        //     numBottles = rem+empty;
        // }
        // if(numBottles == numExchange)
        //     res += numBottles/numExchange;;
        // return res;
        int totalDrank = numBottles;  // total bottles drunk
        int emptyBottles = numBottles;  // empty bottles initially equal to full bottles drunk
        
        // while we have enough empty bottles to exchange
        while (emptyBottles >= numExchange) {
            int newFull = emptyBottles / numExchange;  // get new full bottles by exchanging empties
            totalDrank += newFull;  // drink the newly obtained full bottles
            emptyBottles = emptyBottles % numExchange + newFull;  // update empty bottles count
        }
        return totalDrank;
        // return numBottles + (numBottles-1)/(numExchange-1);
    }
}
