class Solution {
    public void util(int[] arr, List<List<Integer>> res, int rem, int i, ArrayList<Integer> cur){
        if(rem == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(rem < 0 || i >= arr.length) return;
        cur.add(arr[i]);
        util(arr, res, rem-arr[i], i, cur);
        cur.remove(cur.size()-1);
        util(arr, res, rem, i+1, cur);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        util(candidates, res, target, 0, new ArrayList<>());
        return res;
    }
}
