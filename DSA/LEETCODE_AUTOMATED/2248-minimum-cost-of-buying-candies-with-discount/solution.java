class Solution {
    public int minimumCost(int[] cost) {
        int res = 0, n=cost.length;
        Arrays.sort(cost);
        for(int i=n-1; i>=0; i-=3){
            if(i == 0) res += cost[i];
            else res += cost[i]+cost[i-1];
        }
        return res;
    }
}
