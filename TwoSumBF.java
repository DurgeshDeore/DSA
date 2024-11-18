//method = two loops
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length; i++){
            int rem = target-nums[i];
            for(int j=i+1;i<nums.length; j++){
                if(nums[i]== rem){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
