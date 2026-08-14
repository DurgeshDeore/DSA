class Solution {
    public List<Integer> curList = new ArrayList<>();
    public List<List<Integer>> res = new ArrayList<>();
    public void backtrack(int k, int curLen, int sum, int num){
        if(curLen == k && sum == 0){
            res.add(new ArrayList<>(curList));
            return;
        }
        if(num > 9 || curLen > k || sum < 0) return;
        curList.add(num);
        backtrack(k, curLen+1, sum-num, num+1);
        curList.remove(curList.size()-1);
        backtrack(k, curLen, sum, num+1);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        // if((k*(k+1)/2) > n) return res;
        backtrack(k, 0, n, 1);
        return res;
    }
}
