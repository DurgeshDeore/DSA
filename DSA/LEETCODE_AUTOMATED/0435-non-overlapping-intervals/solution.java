class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int cnt=0, n=intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int lst=intervals[0][1];
        for(int i=1; i<n; i++){
            if(intervals[i][0] < lst){
                cnt+=1;
            }else{
                lst=intervals[i][1];
            }
        }
        return cnt;
    }
}
