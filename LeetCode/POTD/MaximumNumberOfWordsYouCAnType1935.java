class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> chars = new HashSet<>();
        for(char ch: brokenLetters.toCharArray()) chars.add(ch);
        String[] words = text.split(" ");
        int cnt=0;
        for(String w: words){
            boolean flag = true;
            for(char ch: w.toCharArray()){
                if(chars.contains(ch)){
                    flag = false;
                    break;
                }
                    
            }
            if(flag) cnt++;
        }
        return cnt;
    }
}
