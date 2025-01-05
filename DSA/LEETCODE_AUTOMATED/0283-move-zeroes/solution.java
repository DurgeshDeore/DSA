class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int temp[] =new int[nums.length];
        int indx=0;
        for(int ele: nums){
            if(ele != 0){
                temp[indx++]=ele;
            }
        }
        indx=0;
        for(int i =0; i<temp.length; i++){
            nums[indx++]=temp[i];
        }
        while(indx<nums.length){
            nums[indx++]=0;
        }
    }
}
