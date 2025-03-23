class Solution {
    int helper(int[] arr, int n){
        if(n==0) return 0;
        int left = helper(arr, n-1)+Math.abs(arr[n]-arr[n-1]);
        int right = (n>1) ?helper(arr, n-2)+Math.abs(arr[n]-arr[n-2]): Integer.MAX_VALUE;
        return Math.min(left,right);
    }
    int minCost(int[] height) {
        return helper(height, height.length-1);
    }
}
