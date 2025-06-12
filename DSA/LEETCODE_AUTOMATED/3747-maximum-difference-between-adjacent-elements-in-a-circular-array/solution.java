class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Integer.MIN_VALUE, n = nums.length;
        for(int i=0; i<n-1; i++){
            if(nums[i] < nums[i+1]){
                max = Math.max(max, nums[i+1]-nums[i]);
            }else{
                max = Math.max(max, nums[i]-nums[i+1]);
            }
        }
        if(nums[n-1] > nums[0]){
            return Math.max(nums[n-1]-nums[0], max);
        }
        return Math.max(nums[0]-nums[n-1], max);
    }
}
