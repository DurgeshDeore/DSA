class Solution {
    public boolean search(int[] nums, int target) {
        boolean res=false;
        int l=0,r=nums.length-1;

        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[l] == target){
                return true;
            }else if(nums[r] == target){
                return true;
            }else if(nums[mid] > target){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }
}
