//method = hashing
class Solution {
    public int firstElementKTime(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
            if(map.get(ele) == k){
                return ele;
            }
        }
        return -1;
    }
}
