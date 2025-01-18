//method = hashing
//better appraoach
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res= new ArrayList<>();
        if(nums.length <= 1){
            return res;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele: map.keySet()){
            if(map.get(ele) > 1){
                res.add(ele);
            }
        }   
        return res;
    }
}
