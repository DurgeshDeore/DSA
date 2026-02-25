class Solution {
    public int subarraySum(int[] nums, int k) {
        int res=0, sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i: nums){
            sum += i;
            if(map.containsKey(sum-k))
                res += map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
}
