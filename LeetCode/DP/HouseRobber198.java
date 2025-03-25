//100.00 %
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[n-1];

        int last=0, secondLast=nums[0], res=0;

        for(int i=1; i<n; i++){
            res = Math.max(nums[i]+last, secondLast);
            last = secondLast;
            secondLast = res;
        }   

        return res;
    }
}
