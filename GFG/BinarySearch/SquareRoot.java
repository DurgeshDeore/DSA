class Solution {
    int floorSqrt(int n) {
        int ans=n;
        for(int i=1;i<=n;i++){
            if(i*i <= n){
                ans=i;
            }else{
                break;
            }
        }
        return ans;
    }
}
