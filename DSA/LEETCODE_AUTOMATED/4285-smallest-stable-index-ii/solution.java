class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length, minE=Integer.MAX_VALUE, maxE=Integer.MIN_VALUE;
        int[] max = new int[n];
        int[] min = new int[n];
        
        for(int i=0; i<n; i++){
            maxE = Math.max(maxE, nums[i]);
            max[i] = maxE;
        }
        
        for(int i=n-1; i>=0; i--){
            minE = Math.min(minE, nums[i]);
            min[i] = minE;
        }
        for(int i=0; i<n; i++){
            if((max[i] - min[i]) <= k)
                return i;
        }
        return -1;
    }
}
