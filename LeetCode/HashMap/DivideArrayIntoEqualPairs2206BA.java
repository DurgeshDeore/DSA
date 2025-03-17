//5.62%
class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        if(n%2 != 0) return false;
        Map<Integer, Integer> map= new HashMap<>();
        for(int ele: nums){
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)-1);
            }else{
                map.put(ele, map.getOrDefault(ele,0)+1);
            }
        }
        for(int key: map.keySet()){
            if(map.get(key)%2 != 0) return false;
        }
        return true;
    }
}
