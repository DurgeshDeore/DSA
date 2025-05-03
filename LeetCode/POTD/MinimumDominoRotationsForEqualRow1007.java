class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n=tops.length, res=Integer.MAX_VALUE;
        int[] freq1=new int[7];
        int[] freq2=new int[7];
        int[] same=new int[7];
        for(int i=0; i<n; i++){
            freq1[tops[i]]++;
            freq2[bottoms[i]]++;
            if(tops[i]== bottoms[i]){
                same[tops[i]]++;
            }
        }
        for(int i=1; i<=6; i++){
            if((freq1[i] + freq2[i] - same[i]) == n){
                int min=Math.min(n-freq1[i], n-freq2[i]);
                res=Math.min(min,res);
            }
        }
        return res==Integer.MAX_VALUE ? -1: res;
    }
}
