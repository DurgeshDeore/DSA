class Solution {
    public int longestOnes(int[] nums, int k) {
        int res=0, l=0, r=0, n=nums.length, zeros=0;
        while(r<n){
            if(nums[r] == 0) zeros += 1;
            while(zeros > k & l<=r){
                if(nums[l] == 0) zeros -= 1;
                l++;
            }
            res = Math.max(res, (r-l)+1);
            r++;
        }
        return res;
    }
}
