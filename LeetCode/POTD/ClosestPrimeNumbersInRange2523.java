//19.05%
class Solution {
    public boolean isPrime(int n){
        if(n<2) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for (int i=5; i*i<=n; i+=6) {
            if (n%i==0 || n%(i+2)==0) {
                return false;
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int[] res = {-1,-1};
        ArrayList<Integer> primes = new ArrayList<>();
        int i=left;
        while(i<=right){
            if(isPrime(i)){
                primes.add(i);
            }
            i++;
        }
        if(primes.size()<2){
            return res;
        }
        int minDiff = Integer.MAX_VALUE;
        for (i=1; i<primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (diff<minDiff) {
                minDiff=diff;
                res[0]=primes.get(i - 1);
                res[1]=primes.get(i);
            }
        }
        return res;
    }
}
