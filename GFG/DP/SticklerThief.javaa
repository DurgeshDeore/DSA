class Solution {
    public int getMaxAmount(int arr[], int n){
        if(n==0) return 0;
        if(n==1) return arr[n-1]; //arr[0]
        int prev1=0, cur=0;
        int prev2=arr[0];
        for(int i= 1; i<n; i++){
            cur = Math.max(arr[i]+prev1, prev2);
            prev1=prev2;
            prev2=cur;
        }
        return cur;
        
    }
    public int findMaxSum(int arr[]) {
        return getMaxAmount(arr, arr.length);
    }
}
