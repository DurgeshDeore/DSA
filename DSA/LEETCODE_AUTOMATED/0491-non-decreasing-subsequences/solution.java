class Solution {
    public HashSet<List<Integer>> set;
    public List<List<Integer>> seq;
    public void backtrack(int[] nums, ArrayList<Integer> cur, int i){
        if(i == nums.length) {
            if(cur.size() > 1 && (!set.contains(new ArrayList<>(cur)))) {
                seq.add(new ArrayList<>(cur));
                set.add(new ArrayList<>(cur));
            }
            return;
        }
        if(cur.size()==0 || cur.get(cur.size()-1) <= nums[i]){
            cur.add(nums[i]);
            backtrack(nums, cur, i+1);  // take
            cur.remove(cur.size()-1);
        }
        backtrack(nums, cur, i+1);  // non-take
        // if(cur.size() > 0) 
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        set = new HashSet<>();
        seq = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), 0);
        return seq;
    }
}
