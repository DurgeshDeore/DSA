class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length, good = 0, half = (n/2);
        long preSum = 0, leftSum = 0;
        for(int i = 0; i<n; i++) {
            if(i<half) leftSum += nums[i];
            preSum += nums[i];
        }
        for(int i=0; i<n; i++){
            long rightSum = preSum - leftSum;
            if(leftSum > rightSum) good += 1;
            leftSum -= nums[i];
            leftSum += nums[(i+half)%n];
        }
        return good;
    }
}
