class Solution {
    public List<String> removeComments(String[] source) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(String s: source){
            int n = s.length();
            if(!flag) sb = new StringBuilder();
            for(int i=0; i<n;){
                if((!flag) && i<n) {
                    if(i<n-1 && s.charAt(i)=='/' && s.charAt(i+1)=='/') {
                        break;
                    }else if(i<n-1 && s.charAt(i)=='/' && s.charAt(i+1)=='*'){
                        if(!flag) flag = true;
                        i+=2;
                    }else {
                        sb.append(s.charAt(i));
                        i++;
                    }
                }else{
                    if(i<n-1 && s.charAt(i)=='*' && s.charAt(i+1)=='/') {
                        if(flag) flag = false;
                        i+=2;
                    }else {
                        i++;
                    } 
                }
            }
            if(sb.length() > 0 && (!flag)) res.add(sb.toString());
        }
        return res;
    }
}
