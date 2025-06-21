class Solution {
    static int kruskalsMST(int V, int[][] edges) {
        DS ds = new DS(V);
        
        Arrays.sort(edges, Comparator.comparingInt(e -> e[2]));
        int res = 0;
        
        for(int e[]: edges){
            int parA = ds.find(e[0]);
            int parB = ds.find(e[1]);
            if(parA != parB){
                ds.union(parA, parB);
                res += e[2];
            }
        }
        return res;
    }
}
class DS{
    private int[] parent, rank;

    public DS(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int i) {
        if (parent[i] != i) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public void union(int x, int y) {
        int s1 = find(x);
        int s2 = find(y);
        if (s1 != s2) {
            if (rank[s1] < rank[s2]) {
                parent[s1] = s2;
            } else if (rank[s1] > rank[s2]) {
                parent[s2] = s1;
            } else {
                parent[s2] = s1;
                rank[s1]++;
            }
        }
    }
}
