class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0], cur=nums[0];
        for(int i=1; i<nums.length; i++){
            cur = Math.max(nums[i], cur+nums[i]);
            res = Math.max(cur, res);
        }
        return res;
    }
}
