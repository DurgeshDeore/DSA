class Solution {
    public boolean isPrime(int n){
        if(n < 2) return false; // no need but,,,
        if(n <= 3) return true;
        if(n%2 == 0 || n%3==0) return false;
        for(int i=5; i<=n/i; i+=6){
            if(n%i == 0 || n%(i+2) == 0) return false;
        }
        return true;
    }
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> primes = new ArrayList<>();
        int sum = 0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                if(sum+i > s) break;
                sum += i;
                primes.add(i);
            }
        }
        // if(sum <= s) return primes;
        // List<Integer> res = new ArrayList<>();
        // int m = primes.size();
        // for(int i=0; i<m; i++){
        //     int curSum = 0;
        //     List<Integer> temp = new ArrayList<>();
        //     for(int j=i; j<m; j++){
        //         if(curSum > s) break;
        //         temp.add(primes.get(j));
        //         curSum += primes.get(j);
        //     }
        //     if(temp.size() > res.size()) res = new ArrayList<>(temp);
        // }
        // return res;
        return primes;
    }
}
