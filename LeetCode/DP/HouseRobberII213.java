//100.00%
class Solution {
    public int houseRobber(int[] nums){
        int n = nums.length, prev1=0, cur=0, prev2=nums[0];
        for(int i=1; i<n; i++){
            cur = Math.max(nums[i]+prev1, prev2);
            prev1 = prev2; 
            prev2 = cur;
        }
        return cur;
    }
    public int rob(int[] nums) {
        int n=nums.length, j=0, k=0;
        if(n == 1) return nums[n-1];
        if(n == 2) return Math.max(nums[0],nums[1]);
        int[] nums1= new int[n-1];
        int[] nums2= new int[n-1];
        for(int i=0; i<n; i++){
            if(i!=0) nums1[j++]=nums[i];
            if(i!=n-1) nums2[k++]=nums[i];
        }
        return Math.max(houseRobber(nums1), houseRobber(nums2));
    }
}
