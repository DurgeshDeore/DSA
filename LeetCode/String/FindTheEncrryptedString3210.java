class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        char[] res = new char[n];
        k%=n; 
        for(int i=0; i<n; i++){
            res[i] = s.charAt((i+k)%n);
        }
        return new String(res);
    }
}
