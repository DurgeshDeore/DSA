//method =two sum
class Solution {
    public int mySqrt(int x) {
        int l=1,r=x,mid=0;
        while(l<=r){
            mid=l+(r-l)/2;
            if((long)mid*mid > (long)x){ //use long for bigger values
                r=mid-1;
            }else if((long)mid*mid < (long)x){
                l=mid+1;
            }else{
                return mid; 
            }
        }
        return Math.round(r); //round the rigth pointer value
    }
}
