class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0], cnt = 1;
        for(int i: nums){
            if(i-min > k){
                min = i;
                cnt++;
            }
        }
        return cnt;
    }
}
