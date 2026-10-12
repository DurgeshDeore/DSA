class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        // instead of the of hashSet we can covert freq arr/map to str to match exact word1 & word2
        int n1=words1.length, n2=words2.length;
        int[] reqFreq = new int[26];
        ArrayList<String> res = new ArrayList<>();

        for(String word: words2){
            int[] curFreq = new int[26];
            for(char c: word.toCharArray()){
                curFreq[c-'a']++;
                reqFreq[c-'a'] = Math.max(reqFreq[c-'a'], curFreq[c-'a']);
            }
        }
        for(String word: words1){
            boolean flag = true;
            int[] curFreq = new int[26];
            for(char c: word.toCharArray()) curFreq[c-'a']++;
            for(int i=0; i<26; i++){
                if(reqFreq[i] > 0 && reqFreq[i] > curFreq[i]){
                    flag = false;
                    break;
                }
            }
            if(flag) res.add(word);
        }

        return res;
    }
}
