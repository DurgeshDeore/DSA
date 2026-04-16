class Solution {
    public int largestAltitude(int[] gain) {
        int preSum = 0, res = 0;
        for(int i: gain){
            preSum += i;
            res = Math.max(res, preSum);
        }
        return res;
    }
}
