class Solution {
    public long ways(int n){
        return n >= 0? (long)(n + 2) * (n + 1) / 2 : 0;
    }
    public long distributeCandies(int n, int limit) {
        long total = ways(n);
        long one = 3*ways(n - (limit+1));
        long two = 3*ways(n- 2*(limit+1));
        long three = ways(n - 3*(limit+1));
        return total - one+two-three;
    }
}
