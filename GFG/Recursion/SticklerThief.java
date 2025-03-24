class Solution {
    public int getMaxAmount(int arr[], int n){
        if(n==0) return 0;
        if(n==1) return arr[n-1];
        int pick = getMaxAmount(arr, n-2) + arr[n-1];
        int notPick = (n>1)? getMaxAmount(arr, n-1): Integer.MIN_VALUE;
        return Math.max(pick, notPick);
    }
    public int findMaxSum(int arr[]) {
        return getMaxAmount(arr, arr.length);
    }
}
