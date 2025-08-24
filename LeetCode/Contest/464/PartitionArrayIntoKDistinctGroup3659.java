class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        if(n%k != 0) return false;
        Map<Integer, Integer> map = new HashMap<>();
        int groups = n/k;
        for(int i: nums) map.put(i, map.getOrDefault(i, 0)+1);
        for(int i: map.values()) if(i>groups) return false;
        return true;
    }
}©leetcode
