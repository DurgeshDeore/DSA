//method = bit manupution
//optimeized
class Solution {
    public int getSum(int a, int b) {
        int carry=0,sum=0;
        if((a==0) || (b==0)){
            return a|b;
        }
        while(b != 0){
            sum = a^b;
            carry = (a&b) << 1;
            a=sum;
            b=carry;
        }
        return sum;
    }
}
