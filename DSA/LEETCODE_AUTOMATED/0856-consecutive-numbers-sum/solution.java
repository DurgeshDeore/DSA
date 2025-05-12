class Solution {
    public int consecutiveNumbersSum(int n) {
        int count = 0;
        for (int L = 1; L * (L + 1) < 2 * n; L++) {
            double a = (double)((1.0 * n - (L * (L + 1)) / 2) / (L + 1));
            if (a - (int)a == 0.0)
                count++;
        }
        return count+1;
    }
}
