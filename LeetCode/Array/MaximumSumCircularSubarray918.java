class Solution {
    public int getMin(int[] nums) {
        int sum = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.min(nums[i], sum+nums[i]);
            res = Math.min(sum, res);
        }
        return res;
    }
    public int getMax(int[] nums) {
        int sum = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum+nums[i]);
            res = Math.max(sum, res);
        }
        return res;
    }
    public int getTotal(int[] nums) {
        int res=0;
        for(int i: nums) res += i;
        return res;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int min=getMin(nums), max=getMax(nums), total=getTotal(nums);
        if(total==min) return max;
        return Math.max(max, total-min);
    }
}
