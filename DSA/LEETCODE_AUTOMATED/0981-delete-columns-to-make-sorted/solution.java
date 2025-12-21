class Solution {
    public int minDeletionSize(String[] strs) {
        int res = 0, n = strs.length, m = strs[0].length();
        for(int col=0; col<m; col++){
            for(int i=1; i<n; i++){
                if(strs[i-1].charAt(col) > strs[i].charAt(col)){
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
