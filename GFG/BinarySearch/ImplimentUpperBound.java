class Solution {
    int upperBound(int[] arr, int target) {
        int l=0, r=arr.length-1, res=arr.length;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(target < arr[mid]){
                res=mid;
                r=mid-1;
            }else if(target < arr[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}
