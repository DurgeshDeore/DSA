//100.00%
class Solution {
    public long coloredCells(int n) {
        // formula for the cell n^2 + (n-1)*(n-1)
        return (long) n*n + (long)(n-1)*(n-1);
    }
}
