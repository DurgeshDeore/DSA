class Solution {
    public int n;
    public String str;
    public boolean isPal(int l, int r){
        while(l<=r){
            if(str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public String getPal(StringBuilder sb, boolean isOdd, int l, int r){
        if(isOdd){
            sb.append(str.charAt(r));
            l-=1;
            r+=1;
        }
        while(l>=0 && r<n){
            if(str.charAt(l) != str.charAt(r)) return sb.toString();
            sb.insert(0, str.charAt(l));
            sb.append(str.charAt(r));
            l-=1;
            r+=1;
        }
        return sb.toString();
    }
    public String longestPalindrome(String s) {
        n = s.length();
        if(n == 1) return s;
        str = s;
        StringBuilder sb = new StringBuilder();
        // approach 1: use nested loops (brute force) n^3
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         if(isPal(i, j) && (j-i)+1 > sb.length()) {
        //             sb = new StringBuilder(s.substring(i, j+1));
        //         }
        //     }
        // }
        // return sb.toString();
        // approach 3: dp n^2
        // approach 3: center expansion n^2
        for(int i=0; i<n; i++){
            String oddPal = "", evenPal = "";
            if(i<n-1 && s.charAt(i)==s.charAt(i+1)) evenPal = getPal(new StringBuilder(), false, i, i+1);
            oddPal = getPal(new StringBuilder(), true, i,i);

            if(sb.length() < oddPal.length()) sb = new StringBuilder(oddPal); 
            if(sb.length() < evenPal.length()) sb = new StringBuilder(evenPal);
        }
        return sb.toString();
    }
}
