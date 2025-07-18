class Solution {
    public int maxSubArray(int[] nums) {
        // int res=0, i=0, j=0, n=nums.length;
        // while(i<n && j<n){
        //     if(j<n){
        //         res=Math.max(res, res+nums[j]);
        //         j++;
        //     }else if(j>=n){
        //         res=Math.max(res, res-nums[i]);
        //         i++;
        //     }
        // }
        // return res;
        int curSum =0, res = nums[0];
        for(int i=0; i<nums.length; i++){
            curSum = Math.max(nums[i],curSum+nums[i]);
            res = Math.max(res, curSum);
        }
        return res;
    }
}
