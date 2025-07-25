class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        if(s.length()==0 && t.length()>=0) return true;
        int j=0;
        for(char ch: t.toCharArray()){
            if(j==s.length()) return true;
            if(ch == s.charAt(j)) {
                j++;
            }
        }
        return j==s.length();
    }
}
