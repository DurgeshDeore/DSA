class Solution {
    public int trap(int[] height) {
        int n = height.length, res=0;
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        // for(int i=0; i<n; i++){
        //     if(i==0){
        //         lMax[i] = height[i];
        //         rMax[n-i-1] = height[n-i-1];
        //     }else{
        //         lMax[i] = Math.max(lMax[i-1], height[i]);
        //         rMax[i] = Math.max(rMax[n-i-1], height[n-i]);
        //     }
        // }
        lMax[0] = height[0];
        for(int i=1; i<n; i++)
            lMax[i] = Math.max(lMax[i-1], height[i]);

        rMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--)
            rMax[i] = Math.max(rMax[i+1], height[i]);

        for(int i=0; i<n; i++){
            res += Math.min(lMax[i], rMax[i]) - height[i];
        }
        return res;
    }
}
