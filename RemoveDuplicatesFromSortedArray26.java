//methods = use two pointers
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=1; //two pointers
        for(;j<nums.length;j++){
            if(nums[j]!=nums[i-1]){ //if they are not equal then update the arr
                nums[i++]=nums[j];
            }
        }
        return i;
    }
}
