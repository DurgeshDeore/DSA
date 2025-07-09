class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = endTime.length;
        int gap[] = new int[n+1];
        gap[0] = startTime[0];
        for(int i=1; i<n; i++) gap[i] = startTime[i]-endTime[i-1];
        gap[n] = eventTime - endTime[n-1];
        int res=0, curSum = 0;
        for(int i=0; i<=n; i++){
            curSum += gap[i];
            if(i > k) curSum -= gap[i-k-1];
            if(i >= k) res = Math.max(res, curSum); 
        }
        return res; 
    }
}
