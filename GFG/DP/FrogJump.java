class Solution {
    int helper(int[] arr, int n){
        if(n==1) return 0;
        int prev1=Math.abs(arr[0]-arr[1]), prev2=0;
        for(int i=2; i<n; i++){
            int curr= Math.min(prev1+ Math.abs(arr[i-1]-arr[i]), prev2+Math.abs(arr[i-2]-arr[i]));
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    int minCost(int[] height) {
        return helper(height, height.length);
    }
}
