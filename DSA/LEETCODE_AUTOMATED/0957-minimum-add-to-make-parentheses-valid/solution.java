class Solution {
    public int minAddToMakeValid(String s) {
        // approach 1: use Stack
        int open = 0, close = 0;
        Stack<Character> valid = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '('){
                valid.push('(');
            }else if(c == ')' && !valid.isEmpty() && valid.peek()=='('){
                valid.pop();
            }else{
                if(c == '(') open += 1;
                else close += 1;
            }

        }
        return valid.size()+ open + close;
    }
}
