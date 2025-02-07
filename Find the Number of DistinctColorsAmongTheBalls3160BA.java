//method = hashing
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> color = new HashMap<>();
        Map<Integer, Integer> cnt = new HashMap<>();
        int m = queries.length;
        int ans[] = new int[m];
        for (int i = 0; i < m; ++i) {
            int ball = queries[i][0], col = queries[i][1];
            if(!color.containsKey(ball)){
                color.put(ball,col);
                cnt.put(col,cnt.getOrDefault(col,0)+1);
            }else{
                int oldCol=color.get(ball);
                cnt.put(oldCol,cnt.getOrDefault(oldCol,0)-1);
                if(cnt.get(oldCol)==0) cnt.remove(oldCol);
                color.put(ball,col);
                cnt.put(col,cnt.getOrDefault(col,0)+1);
            }
            ans[i]=cnt.size(); //store the size of unique colors
        }
        return ans;
    }
}
