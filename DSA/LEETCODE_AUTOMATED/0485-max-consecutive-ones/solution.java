class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0, maxCnt=0, n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 1) cnt+=1;
            else cnt=0;
            maxCnt = Math.max(maxCnt, cnt);
        }
        return maxCnt;
    }
}
