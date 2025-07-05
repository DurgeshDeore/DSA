class Solution {
    public int[] rank;
    public int[] parent;
    public int find(int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]); 
    }
    public boolean union(int a, int b){
        int pa = find(a), pb = find(b);
        if(pa == pb) return false;
        if(rank[pa] >= rank[pb]){
            parent[pb] = pa;
            rank[pa]++;
        }else{
            parent[pa] = pb;
            rank[pb]++;
        }
        return true;
    }
    public int findCircleNum(int[][] isConnected) {
        int cnt = 0;
        int n = isConnected.length;
        rank = new int[n];
        parent = new int[n];
        for(int i=0; i<n; i++) parent[i] = i;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(isConnected[i][j] != 0 /*&& isConnected[j][i] != 0*/){
                    union(i,j);
                }
            }
        }
        for(int i=0; i<n; i++) if(parent[i] == i) cnt++;
        return cnt;
    }
}
