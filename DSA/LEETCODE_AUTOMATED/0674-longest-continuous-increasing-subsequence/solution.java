class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length, res = 1;
        // approach 1: Brute Force n^2
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[j] > nums[j-1]) res = Math.max(res, (j-i)+1);
                else break;
            }
        }
        return res;
    }
}
