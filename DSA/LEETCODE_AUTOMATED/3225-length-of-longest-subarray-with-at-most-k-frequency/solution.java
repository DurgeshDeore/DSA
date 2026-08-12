class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length, maxLen = 0, l= 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int r=0; r<n; r++){
            map.put(nums[r], map.getOrDefault(nums[r], 0)+1);
            while(l<=r && map.getOrDefault(nums[r], 0) > k){
                map.put(nums[l], map.getOrDefault(nums[l], 0)-1);
                l+=1;
            }
            maxLen = Math.max(maxLen, (r-l)+1);
        }
        return maxLen;
    }
}
