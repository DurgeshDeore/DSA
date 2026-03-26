class Solution {
    static boolean isValid(int[] arr, int sum, int i){
        if(i>= arr.length) return sum==0? true: false;
        if(sum == 0) return true;
        if(arr[i] <= sum){
            if(isValid(arr, sum-arr[i], i+1)) return true;
        }
        if(isValid(arr, sum, i+1)) return true;
        return false;
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        return isValid(arr, sum, 0);
    }
}
