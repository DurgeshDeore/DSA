class Solution {
    public int minPartitions(String n) {
        int res = Integer.MIN_VALUE, ld=-1;
        for(char c: n.toCharArray()){
            ld = c-'0';
            res = Math.max(ld, res);
        }
        return res;
    }
}
