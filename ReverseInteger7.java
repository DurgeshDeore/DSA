//best appraoch
class Solution {
    public int reverse(int x) {
        int rev=0,ld=0;
        while(x!=0){
            ld = x%10;
            if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && ld > 7)){
                return 0;
            }else if(rev > Integer.MAX_VALUE / 10 || (rev ==  Integer.MAX_VALUE / 10 && ld <-8)){
                return 0;
            }
            rev = rev*10 + ld;
            x/=10;
        }
        return rev;
    }
}
