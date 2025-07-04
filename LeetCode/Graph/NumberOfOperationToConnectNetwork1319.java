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
        }else if(rank[pa] < rank[pb]){
            parent[pa] = pb;
            rank[pb]++;
        }
        return true;
    }
    public int makeConnected(int n, int[][] connections) {
        int cables = connections.length;
        if(cables < n-1) return -1;
        rank = new int[n];
        parent = new int[n];
        for(int i=0; i<n; i++) parent[i] = i;
        cables = n;
        for(int con[]: connections){
            if(union(con[0], con[1])){
                cables-=1;
            }
        }
        return cables-1;
    }
}
