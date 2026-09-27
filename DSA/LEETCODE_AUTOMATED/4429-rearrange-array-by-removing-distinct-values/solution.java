class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        int[] res = new int[nums.length];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int num: nums) map.put(num, map.getOrDefault(num, 0)+1);
        while(map.size() > 0){
            // Iterator<Integer>  itr = map.keySet().iterator;
            List<Integer>  keys = new ArrayList<>(map.keySet());
            for(int key: keys){
                // int key = itr.next();
                res[j] = key;
                j++;
                map.put(key, map.getOrDefault(key, 0)-1);
                // if(map.get(key) == 0) itr.remove(key);  
                if(map.get(key) == 0) map.remove(key);  
                if(map.size() == 0) return res;
            }
        }
        return res;
    }
}
