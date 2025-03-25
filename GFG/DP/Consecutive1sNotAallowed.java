class Solution {
    
    int countStrings(int n) {
        if(n==0) return 1;
        if(n==1) return 2;
        int a=1, b=2;
        for(int i=2; i<=n; i++){
            int cur = a+b;
            a= b;
            b= cur;
        }
        return b;
    }
}
