class Solution {
    public int lengthOfLastWord(String s) {
        int cnt=0;
        String str = s.trim();
        int i=str.length()-1;
        if(str.length() == 1){
            return 1;
        }
        while(i>=0){
            if(str.charAt(i) == ' '){
                return cnt;
            }
            cnt++;
            i--;
        }
        return cnt;
    }
}
