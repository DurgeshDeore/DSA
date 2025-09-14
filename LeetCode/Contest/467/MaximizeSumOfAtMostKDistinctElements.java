class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length, j=0;
        int[] res = new int[Math.min(k, n)];
        for(int i=n-1; i>=0 && j<k; i--){
            if(i == n-1 || nums[i] != nums[i+1])
                res[j++] = nums[i];
        }
        int len = 0;
        for(int i=0; i<res.length; i++){
            if(res[i] == 0){
                int finalRes[] = new int[i];
                for(j=0; j<i; j++)
                    finalRes[j] = res[j];
                return finalRes;
            }
        }
        return res;
    }
}©leetcode
