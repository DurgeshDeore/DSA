class Solution {
    static int minJumps(int[] arr) {
        int n=arr.length, far=0, jumps=0, curr_end=0;
        if(n <= 1) return 0;
        for(int i=0 ;i<n-1 ;i++) {
            if(arr[i] ==  0 && far <= i)  return -1;
            far=Integer.max(far, i+arr[i]);
            if(curr_end == i){
                curr_end=far;
                jumps++;
                if(curr_end >= n-1){
                    return jumps;
                }
            }
        }
        return jumps;
    }
}
