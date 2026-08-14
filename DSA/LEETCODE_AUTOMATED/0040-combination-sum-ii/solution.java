class Solution {
    public int n;
    public List<List<Integer>> res = new ArrayList<>();
    public void backtrack(int[] candidates, List<Integer> cur, int req, int i){
        if(req == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(req < 0 || i == n) return;
        cur.add(candidates[i]);
        backtrack(candidates, cur, req-candidates[i], i+1);
        cur.remove(cur.size()-1);
        while(i+1 < n && candidates[i] == candidates[i+1]) i += 1;
        backtrack(candidates, cur, req, i+1);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        n = candidates.length;
        Arrays.sort(candidates);
        backtrack(candidates, new ArrayList<>(), target, 0);
        return res;
    }
}
