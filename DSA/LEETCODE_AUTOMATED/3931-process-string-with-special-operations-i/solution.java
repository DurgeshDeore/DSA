class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c == '#') sb.append(sb.toString());
            else if(c == '%') sb.reverse();
            else if(c == '*' & sb.length() >= 1) sb.deleteCharAt(sb.length()-1);
            else if('a' <= c && c <= 'z') sb.append(c);
        }
        return sb.toString();
    }
}
