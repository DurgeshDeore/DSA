class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0, prodSum = 1, num = n;
        while(num != 0){
            int ld = num%10;
            digitSum += ld;
            prodSum *= ld;
            num /= 10;
        }
        return n % (digitSum + prodSum) == 0;
    }
}
