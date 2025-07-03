class Solution {
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n) {
        boolean[][] vis = new boolean[n+1][n+1];
        Queue<int[]> queue = new LinkedList<>();
        int[] x={2,2,-2,-2,1,1,-1,-1};
        int[] y={-1,1,-1,1,-2,2,-2,2};
        int steps = 0;
        queue.add(new int[]{knightPos[0], knightPos[1], 0});
        vis[knightPos[0]][knightPos[1]] = true; 
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            if(cur[0] == targetPos[0] && cur[1] == targetPos[1]){
                return cur[2];
            }
            for(int i=0; i<8; i++){
                int nx = cur[0]+x[i], ny = cur[1]+y[i];
                if(nx <= n && ny <= n && nx >= 1 && ny >= 1 && (!vis[nx][ny])){
                    vis[nx][ny] = true;
                    queue.add(new int[]{nx, ny, cur[2]+1});
                }
            }
        }
        return -1;
    }
}
