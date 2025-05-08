class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int cur=0, n=arr.length;
        Arrays.sort(arr);
        cur=arr[1]-arr[0];
        for(int i=1; i<n; i++){
            if(cur < arr[i]-arr[i-1] || cur > arr[i]-arr[i-1]) return false;
        }
        return true;
    }
}
