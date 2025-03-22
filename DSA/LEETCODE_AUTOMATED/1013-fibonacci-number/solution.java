class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int[] dp = new int[2];
        int res=0;
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            res=dp[0]+dp[1];
            dp[0]=dp[1];
            dp[1]=res;
        }
        return res;
    }
}
