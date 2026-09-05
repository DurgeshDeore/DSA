class Solution {
    public String simplifyPath(String path) {
        String[] dir = path.split("/");
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();
        for(String d: dir){
            if(d.equals("/") || d.equals(".") || d.isEmpty()) continue;
            if(d.equals("..") && st.isEmpty() == false) st.pop();
            else st.push(d);
        }
        while(!st.isEmpty()){
            if(st.peek().equals("..")){
                st.pop();
                continue;
            }
            if(sb.length() != 0) sb.insert(0,"/");
            sb.insert(0, st.pop());
        }
        sb.insert(0, "/");
        // if(sb.length() == 0) return "/";
        return sb.toString();
    }
}
