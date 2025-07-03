class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while(sb.length() < k ){
            int len = sb.length();
            for(int i=0; i<len; i++){
                char c = sb.charAt(i);
                char next = (char) ((c == 'z') ? 'a' : c + 1);
                sb.append(next);
            }
        }
        return sb.charAt(k-1);
    }
}
