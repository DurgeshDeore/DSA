class Solution {
    public boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        // for(int i=4; i<= (n/2); i++){
        //     if(n%i == 0) return false;
        // }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for(int i=left; i<= right; i++){
            if(isPrime(Integer.bitCount(i)))
                res += 1;
        }
        return res;
    }
}
