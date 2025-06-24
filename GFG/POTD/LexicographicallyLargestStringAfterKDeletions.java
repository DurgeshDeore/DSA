class Solution {
    public static String maxSubseq(String s, int k) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()) {
            while(!stack.isEmpty() && k > 0 && stack.peek() < ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while(k-- >0) stack.pop();
        StringBuilder res = new StringBuilder();
        for(char ch: stack) res.append(ch);
        return res.toString();
    }
}
