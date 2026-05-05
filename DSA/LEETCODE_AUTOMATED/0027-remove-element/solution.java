class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length, j=0, i=0;
        while(i<n){
            while( i<n && nums[i] != val){
                nums[j] = nums[i];
                j++;
                i++;
            }
            i++;
        }
        return j;
    }
}
