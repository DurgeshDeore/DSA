class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, res = 0;
        if(n == 1) return res;
        int prev = nums[0];
        for(int i=1; i<n; i++){
            if(nums[i-1] >= nums[i]){
                int expected = nums[i-1]+1;
                res += expected - nums[i];
                nums[i] = expected;
            }
        }
        return res;
    }
}
