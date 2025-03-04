//100.00%
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1,res=nums.length;
        // if(r<=1) return 0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target <= nums[mid]){
                res=mid;
                r=mid-1;
            }else if(target > nums[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return res;
    }
}
