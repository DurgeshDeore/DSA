class Solution {
    public int firstOccur(String word, char ch){
        for(int i=0; i<word.length(); i++)
            if(word.charAt(i) == ch)
                return i;
        return word.length();
    }
    public String reversePrefix(String word, char ch) {
        int r = firstOccur(word, ch), l = 0;
        if(r == word.length()) 
            return word;

        StringBuilder sb= new StringBuilder(word);
        
        while(l < r){
            char c = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r)) ;
            sb.setCharAt(r, c);
            l++;
            r--;
        }
        return sb.toString();
    }
}
