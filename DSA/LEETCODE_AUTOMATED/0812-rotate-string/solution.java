class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length() != s.length()) return false;
        // StringBuilder str = new StringBuilder(s);
        // StringBuilder g = new StringBuilder(goal);
        // for(int i=0; i<)
        return (s+s).contains(goal);
    }
}
