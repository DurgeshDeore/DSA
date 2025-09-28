class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        int res = 0;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if(nums[i]+nums[i+1] > nums[i+2]){
                res = nums[i]+nums[i+1] + nums[i+2];
            }
        }
        return res;
    }
}
