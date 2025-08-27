class Solution {
    public boolean isSubSeq(String s1, String s2) {
        int j=0, n=s2.length(), m=s1.length();
        if (m == 0) return true;
        for(int i=0; i<n; i++){
            if(j<m && s2.charAt(i) == s1.charAt(j)) j++;
            if(j==m) return true;
        }
        return false;
    }
}
