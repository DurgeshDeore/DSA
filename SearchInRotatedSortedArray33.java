//method = two pointers
class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[l] == target){
                return l;
            }else if(nums[r] == target){
                return r;
            }else if(nums[mid] > target){
                l++;
            }else{
                r--;
            }
        }
        return -1;
    }
}
