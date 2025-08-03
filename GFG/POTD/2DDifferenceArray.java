class Solution {
    public ArrayList<ArrayList<Integer>> applyDiff2D(int[][] mat, int[][] opr) {
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;

        int[][] diff = new int[n + 2][m + 2];
        for(int op[]: opr){
            int v = op[0], r1 = op[1], c1 = op[2], r2 = op[3], c2 = op[4];
            diff[r1][c1] += v;
            diff[r1][c2+1] -= v;
            diff[r2+1][c1] -= v;
            diff[r2+1][c2+1] += v;
        }
        for(int i=0; i<n; i++){
            for(int j=1; j<m; j++){
                diff[i][j] += diff[i][j-1];
            }
        }
        for(int j=0; j<m; j++){
            for(int i=1; i<n; i++){
                diff[i][j] += diff[i-1][j];
            }
        }
        for(int i=0; i<n; i++){
            res.add(new ArrayList<>());
            for(int j=0; j<m; j++){
                res.get(i).add(mat[i][j] + diff[i][j]);
            }
        }
        return res;
        
        // 
        // for(int i=0; i<mat.length; i++){
        //     res.add(new ArrayList<>());
        //     for(int j=0; j<mat[0].length; j++){
        //         res.get(i).add(mat[i][j]);
        //     }
        // }
        // for(int o[]: opr){
        //     for(int i=o[1]; i<=o[3]; i++){
        //         for(int j=o[2]; j<=o[4]; j++){
        //             int val=res.get(i).get(j);
        //             res.get(i).set(j, val+o[0]);
        //         }
        //     }
        // }
        // return res;
    }
}
