class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        for(int i=1; i<n; i++){
            for(int j=0; j<i+1; j++){
                int cur = triangle.get(i).get(j);
                if(j==0)
                    cur += triangle.get(i-1).get(j);
                else if(j == i)
                    cur += triangle.get(i-1).get(j-1);
                else if(i > 0 && j<i)
                    cur += Math.min(triangle.get(i-1).get(j), triangle.get(i-1).get(j-1));
                triangle.get(i).set(j, cur);
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) res = Math.min(res, triangle.get(n-1).get(i));
        return res;
    }
}
