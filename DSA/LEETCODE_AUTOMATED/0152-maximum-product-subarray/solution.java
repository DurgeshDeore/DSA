class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0], min=nums[0], res=nums[0], n=nums.length;
        for(int i=1; i<n; i++){
            int temp=max;
            max=Math.max(Math.max(nums[i], max*nums[i]),min*nums[i]);
            min=Math.min(Math.min(nums[i],temp*nums[i]),min*nums[i]);
            res=Math.max(res,max);
        }
        return res;
    }
}
