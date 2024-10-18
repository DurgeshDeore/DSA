class Solution {
    public int lengthOfLastWord(String s) {
        int cnt=0;
        String str = s.trim(); //to remove last spaces
        int i=str.length()-1;
        if(str.length() == 1){ // for string having only one element or only space
            return 1;
        }
        while(i>=0){
            if(str.charAt(i) == ' '){ //if we get first space then return the counter
                return cnt;
            }
            cnt++;
            i--;
        }
        return cnt;
    }
}
