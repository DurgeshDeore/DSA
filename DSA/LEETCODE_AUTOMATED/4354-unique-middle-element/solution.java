class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];
        for(int num: nums) freq[num] += 1;
        return freq[nums[n/2]] == 1;
    }
}
