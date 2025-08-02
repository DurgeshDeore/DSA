class Solution {
    public void util(int n, int k, int indx, List<List<Integer>> res, List<Integer> cur) {
        if (cur.size() == k) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = indx; i <= n; i++) {
            cur.add(i);
            util(n, k, i + 1, res, cur);
            if (cur.size() > 0)
                cur.remove(cur.size() - 1); 
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        util(n, k, 1, res, new ArrayList<>());
        return res;
    }
}
