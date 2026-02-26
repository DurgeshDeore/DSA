import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        if(s.equals("1")) return 0;
        int cnt=0;
        BigInteger num = new BigInteger(s, 2);
        BigInteger one= BigInteger.ONE;
        BigInteger two = new BigInteger("2");

        while(!num.equals(one)){
            if((num.mod(two)).equals(one)){
                num = num.add(one);
                cnt+=1;
            }else{
                num = num.divide(two);
                cnt+=1;
            }
        }
        return cnt;
    }
}
