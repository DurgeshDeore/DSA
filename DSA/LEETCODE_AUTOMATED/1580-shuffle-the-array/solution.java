class Solution {
    public int[] shuffle(int[] nums, int n) {
        int r=n, l=0, i=0;
        int[] res = new int[nums.length];
        while(i<nums.length){
            res[i++] = nums[l++];
            res[i++] = nums[r++];
            // r++;
            // j++;
        }
        // for(int i=0; i<n; i++, j++){
        //     int temp = nums[i];
        //     nums[i] = nums[j];
        //     nums[j] = temp;
        // }
        return res;
    }
}
