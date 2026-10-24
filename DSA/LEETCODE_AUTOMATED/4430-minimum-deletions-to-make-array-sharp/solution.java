class Solution {
    public int minDeletions(int[] nums) {
        int n = nums.length, xors = 0;
        for(int i=0; i<n-1; i++){
            if((nums[i]^nums[i+1]) == 0) xors += 1;
        }
        return xors;
    }
}
