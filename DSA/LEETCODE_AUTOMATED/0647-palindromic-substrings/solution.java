class Solution {
    public boolean isPal(String s){
        int l=0, r=s.length()-1;
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l+=1;
            r-=1;
        }
        return true;
    }
    public int countSubstrings(String s) {
        // approach 1: brute force n^3
        int n = s.length(), res = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n+1; j++){
                if(isPal(s.substring(i, j))) res += 1;
            }
        }
        return res;
    }
}
