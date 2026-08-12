class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=0; i<Math.min(words.length, k); i++) {
            if(sb.length() != 0) sb.append(" ");
            sb.append(words[i]);
        }
        return sb.toString();
    }
}
