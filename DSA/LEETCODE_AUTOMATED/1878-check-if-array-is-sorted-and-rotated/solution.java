class Solution {
    public boolean check(int[] nums) {
        int n=nums.length, diff=0;
        for(int i=1; i<n; i++){
            if(nums[i-1] > nums[i]){
                diff+=1;
                if(nums[i-1] < nums[n-1] || nums[0] < nums[n-1]) return false;
            }
            if(diff > 1) return false;
        }
        return true;
    }
}
