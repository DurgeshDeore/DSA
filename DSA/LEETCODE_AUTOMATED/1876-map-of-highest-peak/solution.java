class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length, n = isWater[0].length;
        int[][] dir = {{1,0},{0,1},{0,-1},{-1,0}};
        int[][] res = new int[m][n];
        for(int i=0; i<m; i++) Arrays.fill(res[i], -1);
        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(isWater[i][j] == 1){
                    q.add(new int[]{i, j});
                }
            }
        }
        int val = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int[] curPos = q.poll();
                if(res[curPos[0]][curPos[1]] != -1) continue;
                res[curPos[0]][curPos[1]] = val;
                for(int[] d: dir){
                    int x = curPos[0]+d[0], y = curPos[1]+d[1];
                    if(x < 0 || y<0 || x>=m || y >=n || res[x][y]!=-1) continue;
                    q.add(new int[]{x, y}); 
                }
            }
            val+=1;
        }
        return res;
    }
}
