
class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        //tabulation 
        int n=arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];
            
        for(int i=0; i<n+1; i++) dp[i][0] = true;
        
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                int val = arr[i-1];
                if(val <= j && dp[i-1][j-val]) dp[i][j] = true;
                else if(dp[i-1][j]) dp[i][j] = true;
            }
        }
        
        return dp[n][sum];
    }
}

// | i \ j  | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
// | ------ | - | - | - | - | - | - | - | - | - | - |
// | 0      | T | F | F | F | F | F | F | F | F | F |
// | 1 (3)  | T | F | F | T | F | F | F | F | F | F |
// | 2 (34) | T | F | F | T | F | F | F | F | F | F |
// | 3 (4)  | T | F | F | T | T | F | F | T | F | F |
// | 4 (12) | T | F | F | T | T | F | F | T | F | F |
// | 5 (5)  | T | F | F | T | T | T | F | T | T | T |
// | 6 (2)  | T | F | T | T | T | T | T | T | T | T |
