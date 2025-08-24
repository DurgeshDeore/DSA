class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==1 || n==2) return n;
        int sumOfOdd=n*n, sumOfEven=n*(n+1);
        int res=0;
        for(int i=1; i<(Math.max(sumOfOdd, sumOfOdd)/2); i++){
            if((sumOfOdd%i)==0 && (sumOfEven%i)==0) res = Math.max(i, res);
        }
        return res;
    }
}©leetcode
