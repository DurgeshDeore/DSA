class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        Set<Integer> valid = new HashSet<>();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(i);
            }else if(c == ')'){
                if(!st.isEmpty()){
                    valid.add(st.pop());
                    valid.add(i);
                }
            }
        }
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c == '(' || c == ')'){
                if(valid.contains(i)) res.append(c);
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
