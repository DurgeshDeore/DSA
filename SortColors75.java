//method = use freq arr
//better approach 
class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        int[] temp= new int[3];
        for(int ele : nums){
            temp[ele]++;
        }
        int indx=0;
        for(int i=0; i<temp[0];i++){
            nums[indx++]=0;
        }
        for(int i=0; i<temp[1];i++){
            nums[indx++]=1;
        }
        for(int i=0; i<temp[2];i++){
            nums[indx++]=2;
        }
        
    }
}
