class Solution {
    public int getGcd(int a, int b){
        // for(int i=Math.min(a,b); i>1; i--){
        //     if((a%i) == 0 && (b%i) == 0) return i;
        // }
        // return 1;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long res = 0;
        // Brute force
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int gcd = getGcd(nums[i], nums[j]);
                long t1 = (nums[i]/gcd), t2 = (nums[j]/gcd);
                long cur = t1*t2;
                res = Math.max(res, cur);
            }
        }
        return res;
    }
}
