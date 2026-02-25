class Solution {
    public int findMaxLength(int[] nums) {
        int res=0, pre=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(0, 1);
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) pre+=1;
            else pre -= 1;
            if(pre == 0) res = Math.max(res, i+1);
            if(map.containsKey(pre))
                res = Math.max(res, i-map.get(pre));
            else
                map.put(pre, i);
        }
        return res;
    }
}
