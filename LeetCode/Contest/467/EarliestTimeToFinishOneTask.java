class Solution {
    public int earliestTime(int[][] tasks) {
        int sum = Integer.MAX_VALUE;
        for(int cur[]: tasks){
            sum = Math.min(sum, cur[0]+cur[1]);
        }
        return sum;
    }
}©leetcode
