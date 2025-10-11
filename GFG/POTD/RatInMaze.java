class Solution {
    public void dfs(ArrayList<String> res, String cur, int[][] maze, int i, int j){
        if(i >= maze.length || j >= maze[0].length || i < 0 || j < 0  || maze[i][j] == 0)
            return;
        if(i==maze.length-1 && j==maze[0].length-1 && maze[i][j] == 1){
            res.add(cur);
            return;
        }
        maze[i][j] = 0;
        dfs(res, cur+"D", maze, i+1, j);
        dfs(res, cur+"R", maze, i, j+1);
        dfs(res, cur+"U", maze, i-1, j);
        dfs(res, cur+"L", maze, i, j-1);
        maze[i][j] = 1;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> res = new ArrayList<>();
        if (maze[0][0] == 0 || maze[maze.length - 1][maze[0].length - 1] == 0)
            return res;
        dfs(res, "", maze, 0, 0);
        Collections.sort(res);
        return res;
    }
}
