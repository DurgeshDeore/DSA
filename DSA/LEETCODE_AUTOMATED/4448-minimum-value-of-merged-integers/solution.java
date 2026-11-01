class Solution {
    public int minMergedInteger(int[] nums) {
        int res = Integer.parseInt(String.valueOf(nums[0]) + String.valueOf(nums[1]));
        for(int i=2; i<nums.length; i+=2){
            int cur = Integer.parseInt(String.valueOf(nums[i]) + String.valueOf(nums[i+1]));
            res = Math.min(cur, res);
        }
        return res;
    }
}
