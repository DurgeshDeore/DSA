class Solution {
    public long countCommas(long n) {
        long limit = 1000;
        if(n < limit) return 0;
        long total = 0;
        while(n >= limit){
            total += (n-limit) + 1;
            limit *= 1000;
        }
        return total;
    }
}
