//method = reccursion
//optimized approach
class Solution {
    public int addDigits(int num) {
        if(num <= 9){ return num; }
        return helper(num);
    }
    public int helper(int num){
        if(num <= 9){
            return num;
        }
        int res=0 , ld=0;
        while(num != 0) {
            ld= num % 10;
            res+=ld;
            num/=10;
        }
        return helper(res);
    }
}
