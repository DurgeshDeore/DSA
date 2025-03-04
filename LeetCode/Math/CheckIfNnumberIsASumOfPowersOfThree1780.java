//100.00%
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0) {
            int rem=n%3;
            n/=3;
            if(rem!=1 && rem!=0){
                return false;
            }
        }
        return true;
    }
}
