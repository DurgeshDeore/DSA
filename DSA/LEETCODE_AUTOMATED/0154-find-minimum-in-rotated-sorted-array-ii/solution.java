class Solution {
    // public int findSmallest(int[] nums, int indx){
    //     int m=nums[indx];
    //     for(int i=indx; i<nums.length; i++) m = Math.min(m, nums[i]);
    //     for(int i=indx; i>=0; i--) m = Math.min(m, nums[i]);
    //     return m;
    // }
    public int findMin(int[] nums) {
        int l=0, r=nums.length-1;
        if(nums[l]<nums[r]) return nums[l];
        while(l<r){
            int m= (l+r)/2;
            if(nums[m] > nums[r])
                l=m+1;
            else if(nums[l] < nums[m])
                r=m;
            else
                r--;
        }
        return nums[l];
    }
}
