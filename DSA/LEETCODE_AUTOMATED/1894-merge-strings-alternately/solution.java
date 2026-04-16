class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0, n=word1.length(),m=word2.length(); 
        StringBuilder sb = new StringBuilder("");
        while(i<n && i<m){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        while(i<n) sb.append(word1.charAt(i++));
        while(i<m) sb.append(word2.charAt(i++));

        return sb.toString();
    }
}
