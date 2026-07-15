class Solution {
    public int gcd(int odd, int even){
        for(int i=even; i>=1; i--){
            if((odd%i == 0) && (even%i == 0)) return i;
        }
        return -1;
    }
    public int gcdOfOddEvenSums(int n) {
        return gcd(n*n, (n*n)+n);
    }
}
