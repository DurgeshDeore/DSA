class Solution {
    public boolean divby13(String s) {
        int n=s.length(), mod=0;
        for(int i=0; i<n; i++){
            int d = s.charAt(i)-'0';
            mod = (mod*10+d) % 13;
        }
        return mod == 0;
    }
}