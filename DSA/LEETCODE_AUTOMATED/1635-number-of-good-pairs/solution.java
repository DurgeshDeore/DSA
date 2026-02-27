class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0)+1);
        for(int i: map.keySet()){
            if(map.get(i) > 1){
                int n = map.get(i);
                res += (n * (n-1)) / 2;
            }
        }
        return res;
    }
}
