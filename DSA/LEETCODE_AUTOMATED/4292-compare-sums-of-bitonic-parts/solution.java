class Solution {
    public int compareBitonicSums(int[] nums) {
        long sumA=nums[0], sumB=0;
        int i=1, n=nums.length;
        while(i<n && nums[i-1] < nums[i]){
            sumA += nums[i];
            i++;
        }
        sumB = nums[n-1];
        i=n-2;
        while(i>=0 && nums[i] > nums[i+1]){
            sumB += nums[i];
            i--;
        }
        return sumA>sumB? 0: (sumA<sumB? 1: -1);
    }
}
