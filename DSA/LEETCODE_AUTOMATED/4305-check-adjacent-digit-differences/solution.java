class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n=s.length();
        for(int i=1; i<n; i++){
            int a=s.charAt(i-1)-'0', b=s.charAt(i)-'0';
            if(Math.abs(a-b) > 2) return false;
        }
        return true;
    }
}
