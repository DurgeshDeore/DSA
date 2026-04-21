class Solution {
    public int tribonacci(int n) {
        if(n == 0 || n == 1) return n;
        if(n <= 3) return n-1;
        int one=0, two=1, three=1, res=0;
        for(int i=3; i<=n; i++){
            res = one+two+three;
            one = two;
            two = three;
            three = res;
        }
        return res;
    }
}
