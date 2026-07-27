class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE, n = nums.length;
        // brute force n^2
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                res = Math.max(res, (nums[i]-1) * (nums[j]-1));
            }
        }
        return res;
    }
}
