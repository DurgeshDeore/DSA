class Solution {
    public int N;
    public List<String> res;
    public void func(StringBuilder pal, int open, int close){
        if(open == N && close == N) {
            res.add(pal.toString());
            return;
        }
        if(open < N){
            pal.append('(');
            func(pal, open+1, close);
            pal.deleteCharAt(pal.length()-1);
        }
        if(close < open){
            pal.append(')');
            func(pal, open, close+1);
            pal.deleteCharAt(pal.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        N=n;
        res = new ArrayList<>();
        func(new StringBuilder(""), 0, 0);
        return res;
    }
}
