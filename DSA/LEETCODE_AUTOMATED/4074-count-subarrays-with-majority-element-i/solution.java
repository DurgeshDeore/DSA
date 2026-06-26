class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        // cnt of subarray = n*(n+1)/2
        int n=nums.length, l=0, cnt=0, subarray=0;
        for(int i=0; i<n; i++){
            cnt=0;
            for(int j=i; j<n; j++){
                if(nums[j] == target) cnt += 1;
                if(2*cnt > (j-i)+1) subarray += 1;
            }
        }
        return subarray;
    }
}
