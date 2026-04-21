class Solution {
    public int helper(int[] nums, int st, int end){
        int prev2 = nums[st];
        int prev1 = Math.max(nums[st], nums[st+1]);
        for(int i=st+2; i<end; i++){
            int cur = Math.max(prev1, prev2+nums[i]);
            prev2 = prev1; 
            prev1 = cur;
        }
        return prev1;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n == 1) return nums[0];
        else if(n == 2) return Math.max(nums[0], nums[1]);
        return Math.max(helper(nums, 0, n-1), helper(nums, 1, n));
    }
}
