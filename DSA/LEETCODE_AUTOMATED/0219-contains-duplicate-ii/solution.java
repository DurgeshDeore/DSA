class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int indx = map.get(nums[i]);
                if(i-indx <= k){
                    return true;
                }
            }
            map.put(nums[i],i);
            //map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            //if(map.get(nums[i])>1){ return true; }
        }
        return false;
    }
}
