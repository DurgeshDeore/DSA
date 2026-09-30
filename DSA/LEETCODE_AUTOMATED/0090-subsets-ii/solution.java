class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    // public HashSet<List<Integer>> set = new HashSet<>();
    public void backtrack(int[] nums, ArrayList<Integer> cur, int st){
        res.add(new ArrayList<>(cur));
        for(int i=st; i<nums.length; i++){
            if(i>st && nums[i-1] == nums[i]) continue;
            cur.add(nums[i]);
            backtrack(nums, cur, i+1);
            cur.remove(cur.size()-1);
        }        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // int n=nums.length;
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), 0);
        return res;
    }
}
