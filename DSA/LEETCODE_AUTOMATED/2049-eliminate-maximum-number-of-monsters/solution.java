class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n=dist.length, res=0;
        int[] time = new int[n];
        for(int i=0; i<n; i++) time[i] = (dist[i]+speed[i]-1) / speed[i];
        Arrays.sort(time);
        for(int i=0; i<n; i++){
            if(i!=0 && time[i] <= i) return res;
            res++;
        }
        return res;
    }
}
