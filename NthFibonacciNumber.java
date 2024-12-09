//method = reccurrssion

class Solution {
    public int nthFibonacci(int n) {
        if(n ==0 ){
            return 0;
        }else if(n == 1 ){
            return 1;
        }
        return nthFibonacci(n-1)+nthFibonacci(n-2); 
    }
}
