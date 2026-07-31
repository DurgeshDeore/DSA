class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length,i=0;
        if(n < 3) return false;
        else if(n >= 3 && arr[0] > arr[1]) return false; 
        while(i+1<n && arr[i] < arr[i+1]) i+=1;
        if(i >= n-1) return false;
        while(i+1<n && arr[i] > arr[i+1]) i+=1;
        return i>=n-1;
    }
}
