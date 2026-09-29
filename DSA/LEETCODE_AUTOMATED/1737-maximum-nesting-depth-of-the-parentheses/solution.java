class Solution {
    public int maxDepth(String s) {
        int depth = 0, n = s.length(), open = 0, close = 0;
        if(n == 1) return depth;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '(') open += 1;
            else if(s.charAt(i) == ')') close += 1;
            depth = Math.max(depth, open-close);
        }
        return depth;
    }
}
