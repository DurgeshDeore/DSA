//method = string manupulation
//better approach
// use string builder for optimized apprroach
class Solution {
    public String reverseWords(String s) {
        if(s.length() <= 1){
            return s;
        }
        String temp = s.trim(); //remove the sapces
        Stack<String> stack = new Stack();
        String word="", res="";

        for(int i=0; i<temp.length(); i++){
            if(temp.charAt(i) != ' '){
                word+=temp.charAt(i);
            }else if(word.length() > 0 ){
                word+=" ";
                stack.push(word);
                word="";
            }
        }
        word+=" ";
        stack.push(word);
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res.trim();
    }
}
