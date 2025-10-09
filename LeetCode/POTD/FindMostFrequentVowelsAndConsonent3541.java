class Solution {
    public int maxFreqSum(String s) {
        int v=0, c=0;
        // HashMap<Character, Integer> vowels = new HashMap<>();
        // HashMap<Character, Integer> consonets = new HashMap<>();
        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a', 'e', 'i', 'o', 'u'
        ));
        int[] freq = new int[26];
        for(char ch: s.toCharArray()){
            int pos = ch-'a';
            freq[pos]++;
        }
        for(int i=0; i<26; i++){
            char ch = (char)(i+'a');
            if(vowels.contains(ch)){
                v = Math.max(v, freq[i]);
            }else{
                c=Math.max(c, freq[i]);
            }
        }
        return v+c;
    }
}
