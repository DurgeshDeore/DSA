class Solution {
    public boolean isPal(String s){
        int l=0, r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!= s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public boolean isPalindromic(String s) {
        // brute force
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            String b = Integer.toBinaryString((int)c);
            if(b.length() < 8){
                for(int i=0; i<8-b.length(); i++) sb.append('0');
            }
            sb.append(b);
        }
        return isPal(sb.toString());
    }
}
