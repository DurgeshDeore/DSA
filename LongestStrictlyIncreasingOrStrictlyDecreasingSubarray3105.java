//optimized appraocah
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1,currLen=1;
        for(int i=0; i<nums.length-1;i++){ //increasing
            if(nums[i]<nums[i+1]){
                currLen++;
            }else{
                currLen=1;
            }
            max=Math.max(max,currLen);
        }
        currLen=1;
        for(int i=0; i<nums.length-1;i++){ //decreasing
            if(nums[i]>nums[i+1]) {
                currLen++;
            }else{
                currLen=1;
            }
            max=Math.max(max,currLen);
        }
        return max;
    }
}
