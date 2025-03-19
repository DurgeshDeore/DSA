//37.35%
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0, n=nums.length;
        double sum=0, maxAvg=0;
        for(;i<k;i++) sum+=nums[i];
        maxAvg=sum/k;
        for(;i<n;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            maxAvg=Math.max(sum/k,maxAvg);
        }
        return maxAvg;
    }
}
