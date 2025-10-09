class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        // int[] dp = new int[n];
        // for(int i=0; i<n; i++)
        //     dp[i] = triangle.get(n-1).get(i);
        for(int i=n-2; i>=0; i--){
            for(int j=0; j<=i; j++){
                // dp[j] = triangle.get(i).get(j) + Math.min(dp[j],dp[j+1]);
                int val = triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
                triangle.get(i).set(j, val);
            }
        }
        return triangle.get(0).get(0);
    }
}
