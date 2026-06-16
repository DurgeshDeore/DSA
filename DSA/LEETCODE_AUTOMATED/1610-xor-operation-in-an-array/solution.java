class Solution {
    public int xorOperation(int n, int start) {
        int res = 0, i = 0;
        while(i < n){
            res ^= start;
            start += 2;
            i++;
        }
        return res;
    }
}
