class Solution {
    public boolean isGood(int[] nums) {
        int m = nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
            m = Math.max(m, i);
        }
        for(int i=1; i<m; i++){
            if(map.getOrDefault(i, 0) != 1) return false;
        }
        return map.get(m) == 2;
    }
}
