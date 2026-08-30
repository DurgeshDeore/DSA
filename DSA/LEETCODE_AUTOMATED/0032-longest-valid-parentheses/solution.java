class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length(), res =0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0; i<n; i++){
            char c= s.charAt(i);
            if(c == '('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()) st.push(i);
                else res = Math.max(res, i-st.peek());
            }
            
        }
        return res;
    }
}
