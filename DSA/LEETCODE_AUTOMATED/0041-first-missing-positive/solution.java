class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length, i=0;
        while(i<n){
            int pos = nums[i]-1;
            if(nums[i]<=n && nums[i] >0 && nums[i] != nums[pos]){
                nums[i] ^= nums[pos];
                nums[pos] ^= nums[i];
                nums[i] ^= nums[pos];
            }else{
                i++;
            }
        }
        for(i=0; i<n; i++){
            if(nums[i] != i+1) return i+1;
        }
        return n+1;
    }
}
