class Solution {
    public String revStr(String s){
        int n=s.length()-1;
        StringBuilder sb = new StringBuilder("");
        while(n >= 0) sb.append(s.charAt(n--));
        return sb.toString();
    }
    public int longestPalindromeSubseq(String s) {
        int n= s.length();
        String revS = revStr(s);
        int[][] dp = new int[n+1][n+1];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                if(s.charAt(i-1) == revS.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][n];
    }
}
