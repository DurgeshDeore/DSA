class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
        for(int i: nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return (max-min)*k;
    }
}
