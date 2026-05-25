class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n=s.length();
        if(n == maxJump) return true;
        else if(s.charAt(0) == '1' || s.charAt(n-1) == '1') return false;
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '0'){
                boolean flag = false;
                for(int j=i-minJump; j>=Math.max(i-maxJump, 0); j--){
                    if(dp[j]){
                        flag = true;
                        break;
                    }
                }
                if(flag) dp[i]=true;
            } 
        }
        return dp[n-1];
    }
}
