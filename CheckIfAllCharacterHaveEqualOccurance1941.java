//method = freq arr
//optimized
class Solution {
    public boolean areOccurrencesEqual(String s) {
        if(s.length() <= 1){ //optional
            return true;
        }
        int freq[] = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        int occ = freq[s.charAt(0)-'a'];
        for(int i=1; i<s.length(); i++){
            if(freq[s.charAt(i)-'a'] != occ){
                return false;
            }
        }
        return true;
    }
}
