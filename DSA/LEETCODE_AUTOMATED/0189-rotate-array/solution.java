class Solution {
    public void rotateArray(int[] nums, int i, int j){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k>n ? k%n: k;
        rotateArray(nums, 0, n-1);
        rotateArray(nums, 0, k-1);
        rotateArray(nums, k, n-1);
    }
}
