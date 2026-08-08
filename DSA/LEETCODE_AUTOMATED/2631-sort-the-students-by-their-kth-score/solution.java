class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        // approach 1: use sorting or PQ
        Arrays.sort(score, (a,b) -> b[k]-a[k]);
        return score;
    }
}
