class Solution {
    List<Integer> res = new ArrayList<>();

    public void helper(int n, StringBuilder sb) {
        if (sb.length() == n) {
            res.add(Integer.parseInt(sb.toString(), 2));
            return;
        }
        sb.append("0");
        helper(n, sb);
        sb.setCharAt(sb.length() - 1, '1');
        helper(n, sb);
        sb.deleteCharAt(sb.length() - 1);
    }

    public List<Integer> grayCode(int n) {
        // helper(n, new StringBuilder(""));
        for(int i=0; i<(1 << n); i++){
            res.add(i ^ (i >> 1));
        }
        return res;
    }
}
