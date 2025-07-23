class Solution {
    public int subarraySum(int[] nums, int k) {
        int res=0, n=nums.length;
        for(int i=0; i<n; i++){
            int sum=0;
            // if(((i+1)*(n-i))==k) res += 1;
            for(int j=i; j<n; j++){
                sum+=nums[j];
                if(sum==k) res+=1;
            }
        }
        return res;
    }
}
