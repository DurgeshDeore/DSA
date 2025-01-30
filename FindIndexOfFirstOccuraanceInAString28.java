//method = string fucntions
//optimized approach 100%
class Solution {
    public int strStr(String haystack, String needle) {
        int m=needle.length(), n=haystack.length();
        if(n < m) return -1;
        if( m == n){
            if(haystack.equals(needle)) return 0;
            else return -1;
        }
        for(int i=0; i<n-m+1; i++){
            if(haystack.substring(i,i+m).equals(needle)) return i;
        }
        return -1;
    }
}
