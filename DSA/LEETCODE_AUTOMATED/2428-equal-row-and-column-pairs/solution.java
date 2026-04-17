class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length, res=0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(grid[i][j]);
                sb.append('.');
            }
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
        }
        for(int j=0; j<n; j++){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n; i++){
                sb.append(grid[i][j]);
                sb.append('.');
            }
            if(map.containsKey(sb.toString()))
                res += map.get(sb.toString());
        }
        return res;
    }
}
