class Solution {
    public int findUnique(int[] arr) {
        int res = 0;
        for(int ele: arr){
            res ^= ele;
        }
        return res;
    }
}
