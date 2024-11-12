//method= using two max
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, currMax=0;
        for(int i=0;i<nums.length; i++){
            if(nums[i] == 1){
                currMax++;
                max = max > currMax? max: currMax;
            }else{
                currMax=0;
            }
        }
        return max;
    }
}
