class Solution {
    public int scoreOfParentheses(String s) {
        // int score = 0;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(char c: s.toCharArray()){
            if(c == '(') {
                st.push(0);
            }else{
                int inScore = st.pop();
                int outScore = st.pop();
                int curScore = outScore + Math.max(2*inScore, 1);
                st.push(curScore);
            }
        }
        return st.peek();
    }
}
