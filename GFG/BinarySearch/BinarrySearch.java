class Solution {
    public int binarysearch(int[] arr, int k) {
        int l=0, r=arr.length-1, res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==k){
                res=mid;
                r=mid-1;
            }else if(k<arr[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}
