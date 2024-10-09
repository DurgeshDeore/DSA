public class PalindromeString {
    public static int isPalindrome(String S) {
        //two pointers
        int lp=0;
        int rp=S.length()-1;
        while(lp <= rp){
            char ch1=S.charAt(lp);
            char ch2=S.charAt(rp);
            if(ch1 != ch2){
                return 0;
            }
            lp++;
            rp--;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }
}
