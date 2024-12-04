//method = freq arr
//optimized solution than hashmap
class Solution {
    public int firstUniqChar(String s) {
        int charCnt[] = new int[26];
        if(s.length()==0){
            return 0;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            charCnt[ch-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(charCnt[ch-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
