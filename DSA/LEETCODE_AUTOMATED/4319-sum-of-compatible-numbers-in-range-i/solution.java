class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int res =0;
        for(int i=1; i<=400; i++){ //we don't know the limit
            boolean flag = false;
            if((n&i) == 0) flag = true;
            if(flag && (Math.abs(n-i) <= k)) res += i;
        }
        return res;
    }
}
