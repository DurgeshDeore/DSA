class Solution {
    public String reverseParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == ')'){
                StringBuilder temp = new StringBuilder();
                while(!st.isEmpty() && st.peek() != '(') temp.append(st.pop());
                st.pop();
                for(char ch: temp.toString().toCharArray()) st.push(ch);
            }else{
                st.push(c);
            }
        }
        while(!st.isEmpty()) res.append(st.pop());
        return res.reverse().toString();
    }
}
