class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0, cur = 0;
        Stack<Integer> st = new Stack<>();
        for(String t: tokens){
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int a = st.pop();
                int b = st.pop();
                if(t.equals("+")){
                    cur = a+b;
                }else if(t.equals("-")){
                    cur = b-a;
                }else if(t.equals("*")){
                    cur = a * b;
                }else{
                    if(a == 0 || b == 0)
                        cur = 0;
                    else
                        cur = b / a;
                }
                st.push(cur);
            }else{
                int n = Integer.valueOf(t);
                st.push(n);
            }
        }
        return st.pop();
    }
}
