class Solution {
    public static String countSort(String arr) {
        int[] cnt = new int[26];
        for(char ch: arr.toCharArray()) cnt[ch-'a']++;
        String res = "";
        for(int i=0; i<26; i++){
            while(cnt[i]-- > 0){
                res+=(char)(i+'a');
            }
        }
        return res;
    }
}
