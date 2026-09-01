class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0, minutes = 0, n = grid.length, m = grid[0].length;
        int[][] dir = {{0,1}, {1,0}, {-1,0}, {0,-1}};
        Queue<int[]> rotten = new LinkedList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m ; j++){
                if(grid[i][j] == 1) fresh += 1;
                else if(grid[i][j] == 2) rotten.add(new int[]{i, j});
            }
        }

        if(fresh == 0) return 0;

        while(!rotten.isEmpty()){
            boolean anyRotten = false;
            int size = rotten.size(); // for 1 minute 
            for(int i=0; i<size; i++){
                int[] curRotten = rotten.poll();
                for(int[] d: dir){
                    int x = curRotten[0] + d[0], y = curRotten[1] + d[1];
                    if(x < 0 || x >= n || y < 0 || y >= m || grid[x][y] != 1) continue;
                    grid[x][y] = 2;
                    fresh -= 1;
                    anyRotten = true;
                    rotten.add(new int[]{x, y});
                }
            }
            if(anyRotten) minutes += 1;
        }

        return fresh > 0? -1: minutes;
    }
}
