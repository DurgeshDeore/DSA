class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int mod = 1_000_000_007;
        int[] nums = new int[n];
        Arrays.fill(nums, 1);
        for(int i=0; i<k; i++){
            // int presum = nums[0];
            for(int j=1; j<n; j++){
                nums[j] = (nums[j]+nums[j-1]) % mod;
            }
        }
        return nums[n-1]%mod;
    }
}
