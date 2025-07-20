class Solution {
    public boolean isPrime(int n){
        if(n<=1) return false;
        if (n == 2 || n == 3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5; i*i<=n; i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    public long splitArray(int[] nums) {
        long sumA=0, sumB=0;
        for(int i = 0; i < nums.length; i++) {
            if(isPrime(i)) {
                sumA += nums[i];
            } else {
                sumB += nums[i];
            }
        }
        return Math.abs(sumA-sumB);
    }
}
