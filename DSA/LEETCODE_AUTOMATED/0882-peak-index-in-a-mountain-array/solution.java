class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0, r=arr.length;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m-1] <= arr[m] && arr[m] >= arr[m+1]) return m;
            else if(arr[m-1] > arr[m]) r = m;
            else l = m;
        }
        return -1;
    }
}
