class Solution {
    public int maxIceCream(int[] costs, int coins) {
            int n=costs.length, cnt=0;
            int preSum=0;
            Arrays.sort(costs);
            for(int i=0; i<n; i++){
                    
                    preSum+=costs[i];
             
                    cnt+=1;
                    if(preSum>coins) return cnt-1;
            }
            return n;
    }
}
