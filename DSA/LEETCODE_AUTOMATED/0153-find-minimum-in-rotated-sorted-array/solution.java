class Solution {
    public int findMin(int[] nums) {
        int l=0, r=nums.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid] > nums[r]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return nums[l];
        // for( l=0; l<r; l++){
        //     if(nums[l] > nums[l+1]){
        //         return nums[l+1];
        //     }
        // }
        // return nums[0];
    }
}
