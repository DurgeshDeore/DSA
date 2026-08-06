class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] res = new int[n*2];
        for(int i=0; i<n; i++) res[i] = nums[i];
        for(int i=n, j=n-1; i<n*2 && j>=0; i++, j--) res[i] = nums[j];
        return res;
    }
}
