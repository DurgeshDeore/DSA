class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        int max=0;
        for(int pos: left) max=Math.max(max, pos);
        for(int pos: right) max=Math.max(max, n-pos);
        return max;
    }
}
