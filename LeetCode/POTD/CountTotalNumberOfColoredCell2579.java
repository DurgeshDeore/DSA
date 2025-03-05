//48.90%
//100.00%
class Solution {
    public long coloredCells(int n) {
        if(n==1) return n;
        long i=4,ans=1;
        while(n>1){
            ans+=i;
            i+=4;
            n--;
        }
        return ans;
        // formula for the cell n^2 + (n-1)*(n-1)
        // return (long) n*n + (long)(n-1)*(n-1);
    }
}
