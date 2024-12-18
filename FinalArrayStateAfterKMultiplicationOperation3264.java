class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int j=0; j<k;j++){
            int small=Integer.MAX_VALUE;
            int indx = -1;
            for(int i=0; i<nums.length; i++){
                if(small > nums[i]){
                    small = nums[i];
                    indx = i;
                }
            }
            if(indx != -1){
                nums[indx] = nums[indx]* multiplier;
            }
        }
        return nums;
    }
}
