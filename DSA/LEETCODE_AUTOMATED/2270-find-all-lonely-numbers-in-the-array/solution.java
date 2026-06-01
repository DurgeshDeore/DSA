class Solution {
    public List<Integer> findLonely(int[] nums) {
        int n=nums.length;
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums) map.put(i, map.getOrDefault(i, 0)+1);
        for(int i=0; i<n; i++){
            if(map.get(nums[i]) == 1){
                // if(i == 0 && !map.containsKey(nums[i]+1)) res.add(nums[i]);
                // else if( i== n-1 && !map.containsKey(nums[i]-1)) res.add(nums[i]);
                // else if(!map.containsKey(nums[i]-1) && !map.containsKey(nums[i]+1)) res.add(nums[i]);
                if(!map.containsKey(nums[i]-1) && !map.containsKey(nums[i]+1)) res.add(nums[i]);
            }
        }   
        return res;
    }
}
