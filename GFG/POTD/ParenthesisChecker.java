class Solution {
    static boolean isBalanced(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch: s.toCharArray()){
            if(!stack.isEmpty()){
                char prev=stack.peek();
                if( ((ch==')' && prev=='(') || (ch=='}' && prev=='{') || (ch==']' && prev=='[')) ) {
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
