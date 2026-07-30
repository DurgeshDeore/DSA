class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFreq = 0, res = 0;
        // use hash map & track the maxFreq
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            maxFreq = Math.max(maxFreq, map.get(num));
        }
        for(int key: map.keySet()){
            if(map.get(key) == maxFreq) res += map.get(key);
        }
        return res;
    }
}
