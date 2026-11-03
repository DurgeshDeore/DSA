class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length, minMoves= 0, maxEle = nums[0];
        for(int num: nums) maxEle = Math.max(maxEle, num);
        for(int num: nums) minMoves = minMoves+Math.abs(maxEle-num);
        return minMoves;
    }
}
