class Solution {
    static boolean isValid(int mat[][]) {
        ArrayList<HashSet<Integer>> rows=new ArrayList<>();
        ArrayList<HashSet<Integer>> cols=new ArrayList<>();
        ArrayList<HashSet<Integer>> boxs=new ArrayList<>();
        for(int i=0; i<9; i++){
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            boxs.add(new HashSet<>());
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                int boxIndx = (i/3)*3+(j/3);
                int val=mat[i][j];
                if(val != 0 && (rows.get(i).contains(val) || cols.get(j).contains(val) || boxs.get(boxIndx).contains(val))) return false;
                rows.get(i).add(mat[i][j]);
                cols.get(j).add(mat[i][j]);
                boxs.get(boxIndx).add(mat[i][j]);
            }
        }
        return true;
    }
}
