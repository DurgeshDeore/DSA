//method = hashing
//better approach
class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele: map.keySet()){
            if(map.get(ele)==1) return ele;
        }
        return -1;
    }
}
