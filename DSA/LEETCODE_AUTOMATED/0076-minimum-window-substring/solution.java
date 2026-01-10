class Solution {
    public boolean match(int[] f1, int[] f2){
        for(int i=0; i<256; i++){
            if(f1[i] < f2[i]) return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        
        int l=0, r=0, n=s.length();
        String res="";
        int[] freq_s1 = new int[256];
        int[] freq_s2 = new int[256];
        
        for(char c: t.toCharArray()) freq_s2[c]++;
        
        while(r<n){
            freq_s1[s.charAt(r)]++;
            while(match(freq_s1, freq_s2)){
                if(res.equals("") || (r - l + 1) < res.length()){
                    res = s.substring(l,r+1);
                }
                freq_s1[s.charAt(l)]--;
                l++;
            }
            r++;
        }
        return res;
    }
}
