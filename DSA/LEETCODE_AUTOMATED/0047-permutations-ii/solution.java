class Solution {
    public void util(int[] nums, boolean[] used, ArrayList<Integer> cur, List<List<Integer>> res){

        if(cur.size() == nums.length) res.add(new ArrayList<>(cur));
        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;
            if(i>0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            used[i] = true;
            cur.add(nums[i]);
            util(nums, used, cur, res);
            used[i] = false;
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        // HashSet<ArrayList<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        util(nums, used, new ArrayList<>(), res);

        // for(List<Integer> lst: set) res.add(lst);

        return res;
    }
}
