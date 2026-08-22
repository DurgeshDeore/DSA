class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        if(k == n) return "0";
        Stack<Character> st = new Stack<>();
        StringBuilder sb =new StringBuilder("");

        for(char c: num.toCharArray()){
            while(!st.isEmpty() && st.peek() > c && k > 0){
                st.pop();
                k-=1;
            }
            st.push(c);
        }
        while(!st.isEmpty() && k > 0) {
            st.pop();
            k-=1;
        }
        while(!st.isEmpty()) sb.append(st.pop());
        while(sb.length() > 0 && sb.charAt(sb.length()-1) == '0') sb.deleteCharAt(sb.length()-1);
        return sb.length() == 0? "0": sb.reverse().toString();
    }
}
