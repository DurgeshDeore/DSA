class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '*'){
                if(!st.isEmpty()) st.pop();
            }else{
                st.push(c);
            }
        }
        while(!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}
