class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int prev1=1, prev2=2, res=0;
        for(int i=2; i<n; i++){
            res = prev1+ prev2;
            prev1 = prev2;
            prev2 = res;
        }
        return res;
    }
}
