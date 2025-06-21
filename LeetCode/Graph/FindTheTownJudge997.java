class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trusted = new int[n+1];
        int[] trustedBy = new int[n+1];
        for(int t[]: trust){
            trusted[t[0]]++;
            trustedBy[t[1]]++;
        }
        for(int i=1; i<=n; i++){
            if(trusted[i] == 0 && trustedBy[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}
