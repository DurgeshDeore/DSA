//63.17%
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int cnt=0,n=colors.length,l=0;
        for(int r=1; r<n+k-1; r++){
            if(colors[r%n] == colors[(r+1)%n]){
                l=r;
            }
            if(r-l+1 == k){
                cnt++;
                l++;
            }
        }
        return cnt;
    }
}
