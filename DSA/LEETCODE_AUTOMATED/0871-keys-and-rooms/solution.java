class Solution {
    public void dfs(List<List<Integer>> rooms, boolean[] vis, int cur){
        vis[cur] = true;
        for(int n: rooms.get(cur)){
            if(!vis[n]){
                dfs(rooms, vis, n);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        dfs(rooms, vis, 0);
        for(boolean v: vis) if(!v) return false;
        return true;
    }
}
