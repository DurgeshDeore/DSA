class Solution {
    public int getSum(int num){
        int sum = 0;
        while(num != 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    public int largestInteger(int n, int s) {
        if(s == 0) return 0;
        else if(s > (n*9)) return -1;
        int num = 9, m=n;
        while(m > 1){
            num *= 10;
            num += 9;
            m -= 1;
        }
        while(num > 0 ){
            int sum = getSum(num);
            if(sum == s) return num;
            num -= 1;
        }
        return num;
    }
}
