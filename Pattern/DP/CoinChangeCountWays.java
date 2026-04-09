class Solution {
    public int count(int coins[], int sum) {
        // int ways=0;
        // HashMap<Integer, Integer> map = new HashMap<>();
        
        // map.put(0, 1);
        // // for(int i: coins) set.add(i);
        
        // for(int i: coins){
        //     if(map.containsKey(sum%i)) 
        //         ways += map.get(sum%i);
        //     map.put(i, map.getOrDefault(i,0)+1);
        // }
        
        // return ways;
        
        if(sum == 0) return 1;
        int n=coins.length;
        int[][] dp = new int[n+1][sum+1];
        for(int i=0; i<n+1; i++)
            dp[i][0] = 1;
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                int val = coins[i-1];   
                dp[i][j] = dp[i-1][j];
                if(val <= j)
                    dp[i][j] += dp[i][j-val];
            }
        }
        return dp[n][sum];
    }
}
