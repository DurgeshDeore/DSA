class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length, i = 0;
        ArrayList<int[]> temp = new ArrayList<>();
        while(i < n && intervals[i][1] < newInterval[0]){
            temp.add(intervals[i]);
            i++;
        }
        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        temp.add(newInterval);
        while(i < n){
            temp.add(intervals[i]);
            i++;
        }
        int[][] res = new int[temp.size()][2];
        for(i=0; i<temp.size(); i++){
            res[i][0] = temp.get(i)[0];
            res[i][1] = temp.get(i)[1];
        }

        return res;
    }
}
