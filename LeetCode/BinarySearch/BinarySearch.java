//100.00%
class Solution {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1, res=-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                res=mid;
                r=mid-1;
            }else if(target>nums[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return res;
    }
}
