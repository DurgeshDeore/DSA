class Solution {
    public int jump(int[] nums) {
        int jumps=0, l=0, r=0, n=nums.length;
        while(r<n-1){
            int maxIndx=0;
            for(int i=l; i<=r; i++){
                maxIndx=Math.max(maxIndx, nums[i]+i);
            }
            l=r+1;
            r=maxIndx;
            jumps++;
        }
        return jumps;
    }
}
