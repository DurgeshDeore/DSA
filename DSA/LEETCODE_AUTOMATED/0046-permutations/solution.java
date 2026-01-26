class Solution {
    public void util(int[] nums, boolean[] isUsed, ArrayList<Integer> cur, List<List<Integer>> res){
        if(cur.size() == nums.length) res.add(new ArrayList<>(cur));

        for(int i=0; i< nums.length; i++){
            if(isUsed[i]) continue;
            isUsed[i] = true;
            cur.add(nums[i]);

            util(nums, isUsed, cur, res); 
            isUsed[i] = false;
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] isUsed = new boolean[nums.length];

        util(nums, isUsed, new ArrayList<>(), res); 
        return res;
    }
}
