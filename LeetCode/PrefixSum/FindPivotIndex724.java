class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length<=0) return 0;
        int preSum=0,cur=0,prefixSum=0;
        for(int ele:nums) prefixSum+=ele;
        for(int i=0;i<nums.length;i++){
            cur+=nums[i];
            preSum=prefixSum-cur;
            if(preSum==cur-nums[i]) return i;
        }
        return -1;
    }
}
