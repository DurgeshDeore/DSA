class Solution {
    nCr(n, r) {
        if(r > n) return 0;
        if(r > n-r) r=n-r;
        let res=1;
        for(let i=0; i<r; i++){
            res*=(n-i);
            res/=(i+1);
        }
        return res;
    }
}
