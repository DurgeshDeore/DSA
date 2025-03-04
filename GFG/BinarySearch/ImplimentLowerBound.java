class Solution {
    int lowerBound(int[] arr, int target) {
        int res=arr.length, r=arr.length-1, l=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid] >= target){
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
