class Solution {
    public int maxRepeating(String sequence, String word) {
        int cnt = 0, n = sequence.length(), m = word.length();
        StringBuilder sb = new StringBuilder("");
        while(sb.length() <= n){
            if(sequence.contains(sb.toString())) cnt = sb.length()/m;
            sb.append(word);
        }
        return cnt;
    }
}
