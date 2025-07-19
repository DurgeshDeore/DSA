class Solution {
    public int findMin(int[] nums) {
        int n=nums.length, l=0, r=n-1;
        if(nums[0] < nums[n-1]) return nums[0];
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m] < nums[r]){
                r=m;
            }else{
                l=m+1;
            }
        }
        return nums[l-1];
    }
}
