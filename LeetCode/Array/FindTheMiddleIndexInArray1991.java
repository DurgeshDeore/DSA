//100.00%
class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0, lsum=0, n=nums.length;
        for(int ele: nums) sum+=ele;
        for(int i=0; i<n; i++){
            sum-=nums[i];
            if(sum == lsum) return i;
            lsum += nums[i];
        }
        return -1;
    }
}
