class Solution {
    int countWays(int n) {
        if(n==1 || n==2) return n;
        int n1=1, n2=2, curr=0;
        for(int i=3; i<=n;i++){
            curr=n1+n2;
            n1=n2;
            n2=curr;
        }
        return curr;
    }
}
