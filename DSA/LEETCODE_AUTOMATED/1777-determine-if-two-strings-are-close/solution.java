class Solution {
    public boolean swap(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(char c: word1.toCharArray()) freq1[c-'a']++;
        for(char c: word2.toCharArray()) freq2[c-'a']++;
        for(int i = 0; i < 26; i++) {
            if((freq1[i] == 0 && freq2[i] != 0) ||
               (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }
        return true;
    }
    public boolean transform(String word1, String word2) {
        int n=word1.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(char c: word1.toCharArray()) freq1[c-'a']++;
        for(char c: word2.toCharArray()) freq2[c-'a']++;
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i]) return false;
        }
        return true;
    }
    public boolean closeStrings(String word1, String word2) {
        int n=word1.length(), m=word2.length();
        if(n!=m) return false;
        return swap(word1, word2) && transform(word1, word2);
    }
}
