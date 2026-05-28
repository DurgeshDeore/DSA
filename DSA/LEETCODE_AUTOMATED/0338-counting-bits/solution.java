class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=1; i<n+1; i++){
            res[i] = Integer.bitCount(i);
        }
        return res;
    }
}
