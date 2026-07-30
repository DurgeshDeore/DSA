class Solution {
    public String greatestLetter(String s) {
        int[] lower = new int[26];
        int[] upper = new int[26];
        StringBuilder res = new StringBuilder("");
        for(char c: s.toCharArray()){
            if(Character.isUpperCase(c)){
                upper[c-'A']++;
            }else{
                lower[c-'a']++;
            }
        }
        for(int i=25; i>=0; i--){
            if(lower[i] > 0 && upper[i] > 0) {
                res.append((char) ('A'+i));
                return res.toString();
            }
        }
        return res.toString();
    }
}
