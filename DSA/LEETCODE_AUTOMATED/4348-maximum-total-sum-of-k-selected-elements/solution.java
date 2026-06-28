class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int n=nums.length-1;
        long res=0;
        Arrays.sort(nums);
        while(k > 0 && n >= 0){
            long curMul = (long) nums[n]*mul;
            res += curMul >(long)nums[n] ? curMul: (long)nums[n];
            mul-=1;
            n-=1;
            k-=1;
        }
        return res;
    }
}
