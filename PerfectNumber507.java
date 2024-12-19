//optimized solution
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=1;
        int sqrt = (int)Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){
            if(num%i == 0){
                sum+=i+ num/i;
            }
        }
        if(sqrt*sqrt == num){
            sum-=sqrt;
        }
        return sum==num;
    }
}
