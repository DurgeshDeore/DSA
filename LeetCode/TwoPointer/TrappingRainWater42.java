//64.16%
class Solution {
    public int trap(int[] height) {
        int res=0, n=height.length;
        int lmax=0,rmax=0, l=0, r=n-1;
        while(l<r){
            lmax =Integer.max(height[l], lmax);
            rmax =Integer.max(height[r], rmax);
            if(lmax<rmax){
                res+=lmax-height[l++];
            }else{
                res+=rmax-height[r--];
            }
        }
        return res;
    }
}
