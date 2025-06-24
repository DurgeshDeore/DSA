class Solution {
    public void util(int[] nums, List<List<Integer>> res, int i, ArrayList<Integer> cur){
        if(i == nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        util(nums, res, i+1, cur);
        cur.remove(cur.size()-1);
        util(nums, res, i+1, cur);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        util(nums, res, 0, new ArrayList<>());
        return res;
    }
}
