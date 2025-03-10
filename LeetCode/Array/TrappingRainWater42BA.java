//64.16%
class Solution {
    public int trap(int[] height) {

        int res=0, n=height.length;
        int[] lmax=new int[n];
        int[] rmax=new int[n];

        lmax[0]=height[0];
        rmax[n-1]=height[n-1];

        for(int i=1; i<n; i++){
            lmax[i]=Integer.max(lmax[i-1],height[i]);
            rmax[n-i-1]=Integer.max(rmax[n-i],height[n-i-1]);
        }
        // for(int i=n-2; i>=0; i--){
        //     rmax[i]=Integer.max(rmax[i+1],height[i]);
        // }

        for(int i=0; i<n; i++){
            int min=Integer.min(lmax[i],rmax[i]);
            res+=min-height[i];
        }

        return res;

    }
}
