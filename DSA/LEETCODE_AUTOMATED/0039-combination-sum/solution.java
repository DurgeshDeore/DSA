class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public void helper(int[] candidates, int target, ArrayList<Integer> curList, int curSum, int i) {
        if(curSum >target || i == candidates.length) return;
        if(curSum == target){
            res.add(new ArrayList<>(curList));
            return;
        }
        // if(curSum + candidates[i] <= target){
            curList.add(candidates[i]);
            helper(candidates, target, curList, curSum+candidates[i], i);
            curList.remove(curList.size()-1);
        // }else{
            helper(candidates, target, curList, curSum, i+1);
        // }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, target, new ArrayList<>(), 0, 0);
        return res;
    }
}
