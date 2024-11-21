//method = two pointer
class Solution {
    int floorSqrt(int n) {
        int l=0, r=n, mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(mid*mid>n){
                r=mid-1;
            }else if(mid*mid < n){
                l=mid+1;
            }else{
                return mid; //if mid*mid == n
            }
        }
        return r; //return nearest of sqrt(n)
    }
}
