class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int lstIndx = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                if(lstIndx != -1){
                    if(i - lstIndx - 1 < k)
                        return false; 
                }
                lstIndx = i;
            }
        }
        return true;
    }
}
