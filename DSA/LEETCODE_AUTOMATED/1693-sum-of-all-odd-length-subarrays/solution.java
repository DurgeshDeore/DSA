class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res=0, n=arr.length;
        for(int i=0; i<n; i++){
            int oddCnt = ((i+1)*(n-i)+1)/2;
            res += arr[i] * oddCnt;
        }
        return res;
    }
}
