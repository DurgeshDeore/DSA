class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        if(n == 2) return nums[0]>nums[1]? 0: 1;
        int l=0, r=n-1;
        while(l<r){
            int m = (l+r) >> 1;
            if(nums[m] > nums[m+1]) r=m;
            else l=m+1;
        }
        return l;
    }
}
