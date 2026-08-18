class Solution {
    public int largestInteger(int[] nums, int k) {
        if(k == nums.length) {
            int max = nums[0];
            for(int num: nums) max = Math.max(max, num);
            return max;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int r=0; r<nums.length; r++) map.put(nums[r], map.getOrDefault(nums[r], 0)+1);
        if (k == 1) {
            int maxEle = -1;
            for (int num : nums) {
                if (map.get(num) == 1) {
                    maxEle = Math.max(maxEle, num);
                }
            }
            return maxEle;
        }
        int maxEle = -1;

        if(map.getOrDefault(nums[0], 0) == 1) maxEle = Math.max(maxEle, nums[0]);
        if(map.getOrDefault(nums[nums.length-1], 0) == 1) maxEle = Math.max(maxEle, nums[nums.length-1]);
    
        return maxEle;
    }
}
