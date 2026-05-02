class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int res=Integer.MAX_VALUE, n=triangle.size();
        for(int i=1; i<n; i++){
            int m=triangle.get(i).size();
            int pm= triangle.get(i-1).size();
            for(int j=0; j<m; j++){
                int cur = triangle.get(i).get(j);
                if(j==0) triangle.get(i).set(j, cur+triangle.get(i-1).get(0));
                else if(j==m-1) triangle.get(i).set(j, cur+triangle.get(i-1).get(pm-1));
                else triangle.get(i).set(j, cur+ Math.min(triangle.get(i-1).get(j-1), triangle.get(i-1).get(j)));
            }
        }
        for(int i=0; i<n; i++){
            res = Math.min(res, triangle.get(n-1).get(i));
        }
        return res;
    }
}
