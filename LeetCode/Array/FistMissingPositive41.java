class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){ //sorting
            int curr = nums[i]-1;
            if(nums[i]>0 && nums[i] < nums.length && nums[i] != nums[curr]){ //ignore -ve
                nums[i] ^= nums[curr];
                nums[curr] ^= nums[i];
                nums[i] ^= nums[curr];
            }else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
