class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int cnt = 0;
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        for(int i=0; i<intervals.length; i++){
            // if(intervals[i][1] >= intervals[i+1][0]) cnt+=1;
            // for(int j=i+i; j<intervals.length; j++){
            //     if(intervals[i][1] >= intervals[j][0] && intervals[i][0] <= intervals[j][0]) cnt+=1;
            //     else if(intervals[j][1] >= intervals[i][0] && intervals[j][0] <= intervals[i][0]) cnt+=1;
            //     else if(intervals[i][0] >= intervals[j][0] && intervals[i][1] <= intervals[j][0]) cnt += 1;
            //     else if(intervals[j][0] >= intervals[i][0] && intervals[j][1] <= intervals[i][0]) cnt += 1;
            // }
            for(int j=0; j<i; j++){
                if(intervals[j][1] >= intervals[i][0]) cnt+=1;
                // else break;
            }
        }
        return cnt;
    }
}
