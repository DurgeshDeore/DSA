class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length, maxIndx = 0, minIndx = 0, res = Integer.MAX_VALUE;
        if(n == 1 || n == 2) return n;
        for(int i=0; i<n; i++){
            if(nums[minIndx] > nums[i]) minIndx = i;
            if(nums[maxIndx] < nums[i]) maxIndx = i;
        }
        res = Math.min(res, (Math.min(maxIndx, minIndx) - 0+1) + (Math.max(maxIndx, minIndx)- Math.min(maxIndx, minIndx))); // left
        res = Math.min(res, (Math.min(maxIndx, minIndx) - 0+1) + (n - Math.max(maxIndx, minIndx))); // both end
        res = Math.min(res, n - (Math.max(maxIndx, minIndx)) + (Math.max(maxIndx, minIndx)- Math.min(maxIndx, minIndx))); // left
        return res;
    }
}
