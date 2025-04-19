class Solution {
    long cnt=0;
    public void findPairs(int[] nums, int lower, int upper, int index){
        if(index >= nums.length){
            return;
        }
        for(int j=index+1; j<nums.length; j++){
            int val =nums[index]+nums[j];
            if(val >= lower && val <= upper){
                cnt++;
            }
        }
        findPairs(nums, lower, upper, index+1);
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        findPairs(nums, lower, upper, 0);
        return cnt;
    }
}
