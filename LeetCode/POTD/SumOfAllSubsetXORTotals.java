//100%
class Solution {
    int ans=0;
    public void helper(int[] nums,int xor, int i){
        if(i>=nums.length){
            ans+=xor;
            return;
        }
        // xor+=(xor^=nums[i]);
        helper(nums,xor^nums[i],i+1);
        helper(nums,xor,i+1);
        
        // helper(nums,xor-=(xor^=nums[i]),i+1);
    }
    public int subsetXORSum(int[] nums) {
        helper(nums,0,0);
        return ans;
    }
}
