//Leetcode

class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int lp=0;
        int rp=str.length()-1;
        while(lp<=rp){
            if(str.charAt(lp) != str.charAt(rp)){
                return false;
            }
            rp--;
            lp++;
        }
        return true;
    }
}
