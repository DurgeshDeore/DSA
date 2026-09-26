class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, opr = 0;
        for(int i=0; i<=n-3; i++){
            if(nums[i] == 0){ //flip
                nums[i] = 1;
                nums[i+1] = (nums[i+1] == 0)? 1: 0;
                nums[i+2] = (nums[i+2] == 0)? 1: 0;
                opr += 1;
            }
        }
        return (nums[n-1]==0 || nums[n-2]==0)? -1: opr;
    }
}
