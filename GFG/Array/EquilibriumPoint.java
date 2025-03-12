class Solution {
    public static int findEquilibrium(int arr[]) {
        int lSum=0, rSum=0, n=arr.length-1;
        
        for(int ele: arr) lSum+=ele;
        
        for(int i=0; i<=n; i++){
            lSum -= arr[i];
            if(lSum == rSum) return i;
            rSum += arr[i];
        }
     
        return -1;
    }
}
