//92.10%
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length(), cnt=0, min=Integer.MAX_VALUE;
        if(k>n) return 0; 
        for(int i=0; i<k; i++){
            if(blocks.charAt(i)=='W') cnt++;
        }
        min=Math.min(cnt,min);
        for(int i=k; i<n; i++){
            if(blocks.charAt(i)=='W') cnt++;
            if(blocks.charAt(i-k)=='W') cnt--;
            min=Math.min(cnt,min);
        }
        return min;
    }
}
