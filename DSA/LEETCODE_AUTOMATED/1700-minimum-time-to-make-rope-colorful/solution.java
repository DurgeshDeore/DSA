class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res = 0, n = neededTime.length;
        int i=1;
        while(i<n){
            int curSum = neededTime[i-1];
            int max = neededTime[i-1];
            while(i<n && colors.charAt(i-1)==colors.charAt(i)){
                curSum += neededTime[i];
                max = Math.max(max, neededTime[i]);
                i++;
            }
            if(curSum-max > 0)
                res += curSum-max;
            i++;
        }
        return res;
    }
}
