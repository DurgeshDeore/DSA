class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res=0, pre=0, n=nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<n; i++){
            pre += nums[i];
            if(map.containsKey(pre-goal))
                res += map.get(pre-goal);
            map.put(pre, map.getOrDefault(pre, 0)+1);
        }
        return res;
    }
}
