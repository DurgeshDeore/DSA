class Solution {
    public boolean[] dp;
    public boolean dfs(int[] arr, int i){
        int n=arr.length;
        // if(i<0 || i>=n || dp[i]) return;
        // dp[i] = true;
        // if(arr[i]==0) return;
        // dfs(arr, i-arr[i]);
        // dfs(arr, i+arr[i]);
        if(i<0 || i>=n || dp[i]) return false;
        dp[i] = true;
        if(arr[i] == 0) return true;
        if(dfs(arr, i-arr[i])) return true;
        if(dfs(arr, i+arr[i])) return true;
        return false;
    }
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        dp = new boolean[n];
        // for(int i=0; i<n; i++){
        //     if(!dp[i] && arr[i] == 0){
        //         dfs(arr, i);
        //     }
        // }
        return dfs(arr, start);
    }
}
