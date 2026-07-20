class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int size = grid.length * grid[0].length;
        k = k%size;
        List<List<Integer>> res = new ArrayList<>();
        // approach 1: brute force
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                list.add(grid[i][j]);
            }
        }
        while(k != 0){
            int lastEle = list.get(list.size()-1);
            list.add(0, lastEle);
            list.remove(list.size()-1);
            k--;
        }
        int cnt = 0;
        ArrayList<Integer> cur = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            cur.add(list.get(i));
            cnt += 1;
            if(cnt == grid[0].length){
                cnt = 0;
                res.add(new ArrayList<>(cur));
                cur = new ArrayList<>();
            }
        }
        return res;
    }
}
