class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length, cnt=0, i=0;
        while(i+2 < n){
            if(2*(nums[i]+nums[i+2]) == nums[i+1]){
                cnt++;
            }
            i++;
        }
        return cnt;
    }
}v
