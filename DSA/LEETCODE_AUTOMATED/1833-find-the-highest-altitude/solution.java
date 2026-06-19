class Solution {
    public int largestAltitude(int[] gain) {
        int preSum = 0, maxSum = 0;
        for(int i: gain){
            preSum += i;
            maxSum = Math.max(maxSum, preSum);
        }
        return maxSum;
    }
}
