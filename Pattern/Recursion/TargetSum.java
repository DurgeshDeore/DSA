class Solution {
    static int findTargetSumWays(int N, int[] A, int target) {
        reccursion 2^n tc
        if(N == 0) return target == 0? 1: 0;
        int include = findTargetSumWays(N-1, A, target-A[N-1]);
        int exclude = findTargetSumWays(N-1, A, target+A[N-1]);
        return include + exclude;
    }
};
