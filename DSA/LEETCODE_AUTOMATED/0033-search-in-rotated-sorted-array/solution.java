class Solution {
//     public int binarySearch(int[] nums, int k, int l, int r){
        
//         return -1;
//     }
    public int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target)
                return i;
        }
        return -1;
    }
}
