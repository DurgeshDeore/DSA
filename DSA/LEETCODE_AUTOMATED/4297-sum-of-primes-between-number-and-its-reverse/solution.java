class Solution {
    public int revInt(int n){
        int rev=0;
        while(n!=0){
            int ld = n%10;
            rev = (rev*10) + ld;
            n/=10;
        }
        return rev;
    }
    public boolean isPrime(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for(int i= 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int rev = revInt(n);
        int res=0;
        for(int i=Math.min(n, rev); i<=Math.max(n, rev); i++){
            if(isPrime(i)) res += i;
        }
        return res;
    }
}
