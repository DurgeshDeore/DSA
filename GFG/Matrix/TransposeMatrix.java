class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0; i<mat.length; i++){
            res.add(new ArrayList<>());
            for(int j=0; j<mat[0].length; j++){
                res.get(i).add(mat[j][i]);
            }
        }
        return res;
    }
}
