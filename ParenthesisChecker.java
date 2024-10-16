static boolean ispar(String x)
    {
        Stack<Character> s = new Stack<>();
        int n = x.length();
        for(int i=0; i<n; i++){
            char ch = x.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                s.push(ch);
            }else if(ch == ']' || ch == '}' || ch == ')'){
                if(s.isEmpty()){
                    return false;
                }
                char lstCh = s.pop();
                if (ch == ']' && lstCh != '[') {
                    return false;
                }
                if (ch == '}' && lstCh != '{') {
                    return false;
                }
                if (ch == ')' && lstCh != '(') {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
