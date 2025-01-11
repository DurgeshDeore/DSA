//method = string maupilation

class Solution {
    
    public String reverseWords(String s) {
        
        StringBuilder ans=new StringBuilder("");
        StringBuilder word=new StringBuilder("");
        String trim_s=s.trim();
        Stack<String> stack = new Stack<>();
        
        for(int i=0; i<trim_s.length(); i++){
            
            if(trim_s.charAt(i) != ' '){
                word.append(trim_s.charAt(i));
            }else if(word.length() > 0){
                word.append(" ");
                stack.push(word.toString());
                word.setLength(0);
            }
        }
        word.append(" ");
        stack.push(word.toString());
        
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.toString().trim();
    }
    
}

