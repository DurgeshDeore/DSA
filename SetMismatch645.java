//method = cycle sort
//optimized code
class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        int[] res={-1,-1};
        while(i<nums.length){
            int curr=nums[i]-1;
            if(nums[i] != nums[curr]){
                nums[i] ^= nums[curr];
                nums[curr] ^= nums[i];
                nums[i] ^= nums[curr];
            }else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                res[0]=nums[i];
                res[1]=i+1;
            }
        }
        return res;
    }
}
