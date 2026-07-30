class Solution {
    public boolean isPall(StringBuilder str){
        int r = str.length()-1, l = 0;
        while(l<r){
            if(str.charAt(l) != str.charAt(r)) return false;
            l+=1;
            r-=1;
        }
        return true;
    }
    public String shortestPalindrome(String s) {
        int n = s.length();
        if((n == 1) || isPall(new StringBuilder(s))) return s;
        // approach 1: Brute force O(n^2) build the pallindrome and check its valid or not 
        // TLE 121/126
        // for(int r=n-1; r>=0; r--){
        //     StringBuilder left = new StringBuilder(s.substring(r, n)).reverse(); // left half
        //     StringBuilder curStr = new StringBuilder(left + s);
        //     if(isPall(curStr)) return curStr.toString();
        // }
        String rev = new StringBuilder(s).reverse().toString();
        for(int i=0; i<n; i++){
            if(s.startsWith(rev.substring(i)))
                return rev.substring(0, i) + s;
        }
        return rev + s;        
    }
}
