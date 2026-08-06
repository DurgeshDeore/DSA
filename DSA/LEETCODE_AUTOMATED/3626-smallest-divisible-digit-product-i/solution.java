class Solution {
    public int getSum(int n){
        int sum = n%10;
        n/=10;
        while(n!=0){
            int ld = n%10;
            sum *= ld;
            n /= 10;
        }
        return sum;
    }
    public int smallestNumber(int n, int t) {
        int i=n;
        for(; i<Integer.MAX_VALUE; i++){
            if(getSum(i)%t == 0) break;
        }
        return i;
    }
}
