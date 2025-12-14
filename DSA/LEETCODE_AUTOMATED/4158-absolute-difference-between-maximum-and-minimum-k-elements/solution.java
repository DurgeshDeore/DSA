class Solution {
    public int absDifference(int[] nums, int k) {
        if(nums.length == k) return 0;
        int n=nums.length, min=0, max =0;
        Arrays.sort(nums);
        for(int i=0; i<k; i++){
            min += nums[i];
            max += nums[n-i-1];
        }
        return max-min;
    }
}
