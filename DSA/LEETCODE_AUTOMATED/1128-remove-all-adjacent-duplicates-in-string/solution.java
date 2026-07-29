class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(!st.isEmpty() && st.peek() == c){
                st.pop();
            }else{
                st.push(c);
            }
        }
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}
