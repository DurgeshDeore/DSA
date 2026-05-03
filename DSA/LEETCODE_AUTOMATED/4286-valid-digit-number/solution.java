class Solution {
    public boolean validDigit(int n, int x) {
        String s = new String(String.valueOf(n));
        if(s.charAt(0) == (char) (x+'0')) return false;
        return s.contains(String.valueOf(x));
    }
}
