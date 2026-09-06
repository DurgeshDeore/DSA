class Solution {
    public int backtrack(String s, String t, int n, int m){
        if(n<0) return m<0? 1: 0;
        if(m<0) return 1;
        int take = 0, nonTake = 0;
        if(s.charAt(n) == t.charAt(m))
            take = backtrack(s, t, n-1, m-1) + backtrack(s, t, n-1, m);
        else 
            nonTake = backtrack(s, t, n-1, m);
        return take + nonTake;
    }
    public int numDistinct(String s, String t) {
        // use backtrack
        // TLC (55/66)
        int n=s.length(), m=t.length();
        // return backtrack(s, t, n-1, m-1);

        // use dp
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<n+1; i++) dp[i][0] = 1;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
                else 
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][m];
    }
}
