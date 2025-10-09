class Solution {
    public boolean notZero(int n){
        while(n > 0){
            if(n%10 == 0) return false;
            n/=10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int res[] = new int[2];
        for(int i=1; i<n; i++){
            int b = n-i;
            if(notZero(i) && notZero(b)){
                res[0] = i;
                res[1] = b;
                return res;
            }
        }
        return res;
    }
}
