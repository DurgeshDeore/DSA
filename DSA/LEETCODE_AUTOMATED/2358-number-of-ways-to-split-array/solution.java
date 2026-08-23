class Solution {
    public int waysToSplitArray(int[] nums) {
        int cnt=0;
        long preSum = 0, leftSum = 0;
        for(int ele: nums) preSum += ele;
        for(int i=0; i<nums.length-1; i++) {
            leftSum += nums[i];
            if(leftSum >= (preSum - leftSum)) cnt += 1;
        }
        return cnt;
    }
}
