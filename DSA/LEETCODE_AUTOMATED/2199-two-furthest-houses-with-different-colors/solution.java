class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length, res=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(colors[i] != colors[0])
                res = Math.max(res, i);
            if(colors[i] != colors[n-1])
                res = Math.max(res, n-1-i);
        }
        return res==Integer.MIN_VALUE? -1: res;
    }
}
