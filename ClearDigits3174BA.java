//method = stack & string builder
//better
class Solution {
    public String clearDigits(String s) {
        Stack<Character>stack=new Stack<>();
        StringBuilder res=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') && !stack.isEmpty()) {
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
