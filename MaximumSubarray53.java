//method = kadanes algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0,maxSum=nums[0]; //initially maxSum=nums[0]
        if(nums.length <= 0){
            return 0;
        }
        for(int ele: nums){
            currSum =ele > (currSum+ele)? ele: (currSum+ele); //find currSum
            maxSum = maxSum > currSum? maxSum: currSum; //camapare currSum with maxSum
        }
        return maxSum;
    }
}
