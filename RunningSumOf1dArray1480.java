//method = prefix sum
class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int currSum=0;
        for(int i=0; i<nums.length; i++){
            currSum += nums[i]; //update sum
            sum[i] = currSum; //store it new arr
        }
        return sum;
    }
}
