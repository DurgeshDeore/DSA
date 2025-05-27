class Solution {
    public int trap(int[] height) {
        int l=0, r=height.length-1, res=0, rmax=0, lmax=0;
        while(l<r){
            rmax=Math.max(rmax, height[r]);
            lmax=Math.max(lmax, height[l]);
            if(rmax<lmax){
                res+=rmax-height[r--];
            }else{
                res+=lmax-height[l++];
            }
        }
        return res;
    }
}
