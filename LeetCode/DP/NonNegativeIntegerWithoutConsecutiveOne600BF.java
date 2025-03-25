class Solution {
    public boolean isConsecutive(int n){
        return (n & (n >> 1)) != 0;
    }
    public int findIntegers(int n) {
        if(n<3) return n+1;
        int cnt=0;
        for(int i=0; i<=n; i++){
            if(!isConsecutive(i)) cnt++;
        }
        return cnt;
    }
}
