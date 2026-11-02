class Solution {
    public int minMoves(int[] nums) {
        int minEle = nums[0], n = nums.length;
        long sum = 0;
        for(int num: nums){
            minEle = Math.min(minEle, num);
            sum += (long)num;
        }
        return (int)(sum - (long)minEle * n);
    }
}
