class Solution {
    List<String> res = new ArrayList<>();
    public boolean isValid(String s, int n){
        for(int i=1; i<n; i++){
            if(s.charAt(i-1) == '0' && s.charAt(i) == '0')
                return false;
        }
        return true;
    }
    public void helper(int n, StringBuilder sb){
        if(sb.length() == n){
            String cur = sb.toString();
            if(isValid(cur, n))
                res.add(new String(cur));
            return;
        }
        sb.append("0");
        helper(n, sb);
        sb.setCharAt(sb.length()-1, '1');
        helper(n, sb);
        sb.deleteCharAt(sb.length()-1);
    }
    public List<String> validStrings(int n) {
        helper(n, new StringBuilder(""));
        return res;
    }
}
