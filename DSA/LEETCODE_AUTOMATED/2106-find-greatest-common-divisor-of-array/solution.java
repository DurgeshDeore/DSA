class Solution {
    public int findGCD(int[] nums) {
        int small = nums[0], large = nums[0];
        for(int i: nums){
            small = Math.min(small, i);
            large = Math.max(large, i);
        }
        for(int i=large; i>=1; i--){
            if((small%i == 0) && (large%i == 0)) return i;
        }
        return Integer.MAX_VALUE;
    }
}
