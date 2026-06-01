class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length, res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        if(k == n) return nums[n-1]-nums[0];
        int l=0;
        for(int r=0; r<n; r++){
            if((r-l) == k-1){
                res = Math.min(nums[r]-nums[l++], res);
            }
        }
        return res;
    }
}
