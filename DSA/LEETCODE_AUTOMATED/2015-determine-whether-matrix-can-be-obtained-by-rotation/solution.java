class Solution {
    public boolean isMatch(int[][] mat, int[][] target) {
        int n = mat.length, m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }

    public void rotate(int[][] mat, int[][] target) {
        int n = mat.length, m = mat[0].length;
        for (int i = 0; i < n; i++) { //transpose
            for (int j = i; j < m; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) { //reverse
            int l = 0, r = m - 1;
            while (l < r) {
                int temp = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = temp;
                l++;
                r--;
            }
        }
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length, m = mat[0].length, i = 0;
        if (isMatch(mat, target))
            return true;
        while (i <= 3) {
            rotate(mat, target);
            if (isMatch(mat, target))
                return true;
            i++;
        }
        return false;
    }
}
