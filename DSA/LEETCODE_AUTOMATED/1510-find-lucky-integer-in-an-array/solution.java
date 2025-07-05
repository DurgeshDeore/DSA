class Solution {
    public int findLucky(int[] arr) {
        int res = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: arr) map.put(ele, map.getOrDefault(ele, 0)+1);
        for(int key: map.keySet()) if(map.get(key) == key) res = Math.max(res, key);
        return res;
    }
}
