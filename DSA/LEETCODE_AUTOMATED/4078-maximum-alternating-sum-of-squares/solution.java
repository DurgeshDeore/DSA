class Solution {
    public long maxAlternatingSum(int[] nums) {
        int l = 0, r = nums.length-1;
        long res = 0;
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length/2; i++) res -= nums[i];
        for(int i=nums.length/2; i<nums.length; i++) res += nums[i];
        return res;
    }
}
