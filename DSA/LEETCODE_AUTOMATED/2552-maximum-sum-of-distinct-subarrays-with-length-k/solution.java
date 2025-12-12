class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long res = 0 ,curSum =0;
        int i=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j=0; j<n; j++){
            curSum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j],0)+1);
            if(j-i+1 > k){
                curSum -= nums[i];
                map.put(nums[i], map.getOrDefault(nums[i], 0)-1);
                map.remove(nums[i], 0);
                i++;
            }
            if(map.size() == k && j-i+1 == k)
                res = Math.max(res, curSum);
        }
        return res;
    }
}
