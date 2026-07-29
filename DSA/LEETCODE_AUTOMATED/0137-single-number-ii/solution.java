class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;

        // approach 1: use HashMap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i: nums) map.put(i, map.getOrDefault(i, 0)+1);
        // for(int k: map.keySet()){
        //     if(map.get(k) == 1) return k;
        // }
        // return -1;
        int ones = 0, twos = 0;
        for(int num: nums){
            ones = (ones^num) & ~twos;
            twos = (twos^num) & ~ones;
        }
        return ones;
        // approach 2: use Soring
        
        // approach 3: use Bit manupulation
    }
}
