class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        ArrayList<int[]> res = new ArrayList<>();
        int[] prev = intervals[0];
        res.add(prev);
        for(int i =1; i<intervals.length; i++){
            int[] cur = intervals[i];
            if(prev[1] >= cur[0]){
                prev[1] = Math.max(prev[1], cur[1]);
            }else{
                prev = cur;
                res.add(cur);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
