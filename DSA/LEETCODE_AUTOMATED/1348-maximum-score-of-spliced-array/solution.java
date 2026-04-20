class Solution {
    public int getMax(int[] nums1, int[] nums2) {
        int max = Integer.MIN_VALUE, cur=0;
        for(int i=0; i<nums1.length; i++){
            int diff = nums1[i] - nums2[i];
            cur = Math.max(diff, cur+diff);
            max = Math.max(max, cur);
        }
        return max == Integer.MIN_VALUE? 0: max;
    }
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int n=nums1.length, sum1=0, sum2=0;
        for(int i: nums1) sum1+=i;
        for(int i: nums2) sum2+=i;
        int res1 = sum1 + getMax(nums2, nums1);
        int res2 = sum2 + getMax(nums1, nums2);
        return Math.max(res1, res2);
    }
}
