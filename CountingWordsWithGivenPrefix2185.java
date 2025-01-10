//method = string manupulation
//optimized approach
class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt=0, m=pref.length();
        for(String word: words){
            //String prefix = word.substring(0,m);
            if(word.length() >= m && word.startsWith(pref)){
                cnt++;
            }
            // if(prefix.equals(pref)){
            //     cnt++;
            // }
        }
        return cnt;
    }
}
