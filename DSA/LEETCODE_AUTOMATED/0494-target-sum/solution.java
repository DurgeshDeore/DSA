class Solution {
    // int ways=0;
    public int helper(int[] nums, int target, int i){
        if(i>=nums.length) return target == 0 ? 1: 0;
        // if(target == 0) return 1;
        int include = helper(nums, target-nums[i], i+1);
        int exclude = helper(nums, target+nums[i], i+1);
        return include + exclude;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0);
    }
}
