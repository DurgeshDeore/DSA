class Solution {
    public char findTheDifference(String s, String t) {
        int res =0;
        // // Set<Character> set = new HashSet<>();
        // int freq[] = new int[26];
        // for(char ch: s.toCharArray()) {
        //     // set.add(ch);
        //     freq[ch-'a']++;
        // }
        // for(char ch: t.toCharArray()){
        //     // if(!set.contains(ch)) return ch;
        //     freq[ch-'a']--;
        // }
        // for(int i=0; i<26; i++) if(freq[i]!=0) return (char)(i+'a');
        // return '#';
        for(char ch: s.toCharArray()) res^=ch;
        for(char ch: t.toCharArray()) res^=ch;
        return (char)res;
    }
}
