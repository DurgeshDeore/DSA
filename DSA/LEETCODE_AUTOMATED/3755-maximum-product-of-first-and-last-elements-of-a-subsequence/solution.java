class Solution {
    public long maximumProduct(int[] nums, int m) {
        long res=1l*nums[0]*nums[m-1], max=nums[0], min=nums[0];
        for(int i=0; i<=nums.length-m; i++){
            max=Math.max(max, nums[i]);
            min=Math.min(min, nums[i]);
            res=Math.max(res, Math.max(1L*nums[i+m-1]*min, 1L*nums[i+m-1]*max));
        }
        return res;
    }
}
