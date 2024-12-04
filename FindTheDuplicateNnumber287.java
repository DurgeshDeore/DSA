//method = freq arr
//better approach use two pointer for better approach
class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length <= 1){
            return -1;
        }
        int freq[] = new int[nums.length];
        for(int ele: nums){
            freq[ele]++;
        }
        int indx=0;
        for(int ele: freq){
            if(ele > 1){
                return indx;
            }
            indx++;
        }
        return -1;
    }
}
