class Solution {
    public int bs(int[] g){
        int l=0, r=g.length;
        while(l<r){
            int m = (r+l)/2;
            if(g[m] >= 0)
                l=m+1;
            else
                r=m;
        }
        return l;
    }
    public int countNegatives(int[][] grid) {
        int n = grid[0].length, res = 0;
        for(int g[]: grid){
            int indx = bs(g);
            if(indx < n) res += (n-indx);
        }
        return res;
    }
}
