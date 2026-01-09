class Solution {
    public boolean compare(int[] freq1, int[] freq2){
        for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i])
                return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int l=0, r=0, m=s1.length(), n=s2.length();
        int[] freq1= new int[26];
        int[] freq2= new int[26];

        for(char c: s1.toCharArray()) freq1[c-'a']++;

        while(r<n){
            char ch = s2.charAt(r);
            freq2[ch-'a']++;
            if((r-l)+1 == m){
                if(compare(freq1, freq2))
                    return true;
                char c = s2.charAt(l);
                freq2[c-'a']--;
                l++;
            }
            r++;
        } 
        return false;
    }
}
