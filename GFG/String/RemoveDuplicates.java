class Solution {
    String removeDups(String s) {
        int[] freq=new int[26];
        StringBuilder res=new StringBuilder("");
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a']<=1){
                res.append(ch);
            }
        }
        return res.toString();
    }
}
