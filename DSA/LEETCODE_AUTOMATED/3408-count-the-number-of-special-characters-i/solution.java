class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt=0;
        int[] lower = new int[26];
        int[] upper = new int[26];
        for(char c: word.toCharArray()){
            if(Character.isUpperCase(c)){
                upper[c-'A']++;
            }else{
                lower[c-'a']++;
            }
        }
        for(int i=0; i<26; i++){
            if(lower[i] > 0 && upper[i] > 0) cnt++;
        }
        return cnt;
    }
}
