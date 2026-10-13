class Solution {
    public int countSpecialIntegers(int[] nums) {
        int res = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])) map.put(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        for(int key: map.keySet()){
            if(map.get(key).size() >= 3){
                boolean isValid = true;
                int diff = map.get(key).get(1)-map.get(key).get(0);
                for(int i=1; i<map.get(key).size(); i++){
                    if(map.get(key).get(i)-map.get(key).get(i-1) != diff){
                        isValid = false;
                        break;
                    }
                }
                if(isValid) res += 1;
            }
        }

        return res;
    }
}
