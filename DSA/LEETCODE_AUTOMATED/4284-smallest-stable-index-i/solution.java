class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minArr = new int[n];
        int[] maxArr = new int[n];
        
        for(int i=n-1; i>=0; i--) {
            if(i == n-1) minArr[i] = nums[i];
            else minArr[i] = Math.min(minArr[i+1], nums[i]);
        }
        for(int i=0; i<n; i++) {
            if(i == 0) maxArr[i] = nums[i];
            else maxArr[i] = Math.max(maxArr[i-1], nums[i]);
        }

        for(int i=0; i<n; i++){
            if(maxArr[i]-minArr[i] <= k) return i; 
        }
        
        return -1;
    }
}
