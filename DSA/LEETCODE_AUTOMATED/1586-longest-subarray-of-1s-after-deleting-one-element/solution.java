class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0, l=0, n=nums.length, zero=0;
        for(int r=0; r<n; r++){
            if(nums[r] == 0) zero += 1;
            while(zero>1 && l<r){
                if(nums[l] == 0) zero -= 1;
                l++;
            }
            res = Math.max(res, (r-l));
        }
        return res;
    }
}
