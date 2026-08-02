class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        // approach 1: two pointers
        int l=0, n=nums.length, even=0, odd=0, cnt=0, exRatio = (a/b);
        // for(int r=0; r<n; r++){
        //     if(nums[r]%2 == 0) even += 1;
        //     else odd += 1;
        //     int curRatio = (even == 0|| odd == 0) ? 0: (even/odd);
        //     if(curRatio <= exRatio || even == 0 || odd == 0) cnt += 1;
        //     while(l<=r && curRatio > exRatio) {
        //         if(nums[l]%2 == 0) even -= 1;
        //         else odd -= 1;
        //         curRatio = (even == 0|| odd == 0)? 0: (even/odd);
        //     }
        // }
        // return cnt;
        for(int i=0; i<n; i++){
            odd =0;
            even = 0;
            for(int j=i; j<n; j++){
                if(nums[j]%2 == 0) even += 1;
                else odd += 1;
                if (odd > 0 && (long) even * b <= (long) a * odd) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
