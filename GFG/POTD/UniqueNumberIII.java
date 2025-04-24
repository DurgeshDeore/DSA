class Solution {
    public int getSingle(int[] arr) {
        int res;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: arr) map.put(ele, map.getOrDefault(ele, 0)+1);
        for(int ele: map.keySet()){
            if(map.get(ele) == 1) {
                return ele;
            }
        }
        return -1;
    }
}
