class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length, i = 0;
        if (n < 3)
            return false;
        while (i + 1 < n && nums[i] < nums[i + 1])
            i++;
        if (i == 0 || i == n - 1)
            return false;
        while (i + 1 < n && nums[i] > nums[i + 1])
            i++;
        if (i == 0 || i == n - 1)
            return false;
        while (i + 1 < n && nums[i] < nums[i + 1])
            i++;
        return i == n - 1;
    }
}
