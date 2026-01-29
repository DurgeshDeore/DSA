class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, r=nums.length;
        while(l<r){
            int m=(r+l)/2;
            if(nums[m] == target) return m;
            else if(nums[m] > target) r = m;
            else l= m+1;
        }
        return l;
    }
}
