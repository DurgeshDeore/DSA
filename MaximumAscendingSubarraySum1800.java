//method = max of two variables
class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0], currSum=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                currSum+=nums[i];
            }else{
                currSum=nums[i];
            }
            sum=sum>currSum?sum:currSum;
        }
        return sum;
    }
}
