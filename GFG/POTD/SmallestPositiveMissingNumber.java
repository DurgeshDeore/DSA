class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        for(int i=0; i<n; i++){
            while(arr[i]>0 && arr[i]<=n && arr[arr[i]-1] != arr[i]){
                int indx=arr[i]-1;
                int temp = arr[i];
                arr[i] = arr[indx];
                arr[indx] = temp;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] != i+1) return i+1;
        }
        return n+1;
    }
}
