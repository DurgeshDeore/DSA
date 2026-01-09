class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k == 0) return 0;
        int res=0, l=0, r=0, n= nums.length, prod=1;
        while(r<n){
            prod *= nums[r];
            while(prod >= k && l<=r){
                prod/=nums[l];
                l++;
            }
            res += (r-l)+1;
            r++;
        }
        return res;
    }
}
