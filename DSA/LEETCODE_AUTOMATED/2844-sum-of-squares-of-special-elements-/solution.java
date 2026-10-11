class Solution {
    public int sumOfSquares(int[] nums) {
        int squareSum = 0, n = nums.length;
        for (int i=0; i<n; i++) {
            int num = nums[i];
            if (n % (i+1) == 0)
                squareSum += (num * num);
        }
        return squareSum;
    }
}
