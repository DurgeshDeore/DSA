//88.66%
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0, res=0;
        while(j < s.length && res < g.length){
            if(s[j] >= g[res]){
                res ++;
            }
            j++;
        }
        return res;
    }
}
