class Solution {
    public int helper(int[] nums, int target, int i) { // not working due to time complexity
        if( i>= nums.length) return target==0 ?1: 0;
        int include = 0;
        if(nums[i] <= target)
            include = helper(nums, target-nums[i], i+1);
        int exclude = helper(nums, target, i+1);
        return include+exclude;
    }
    public int perfectSum(int[] nums, int target) {
        return helper(nums, target, 0);
    }
}
