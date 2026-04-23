class Solution {
    public boolean check(int[] nums) {
        int diff=0, cur=nums[0], n=nums.length;
        for(int i=1; i<n; i++){
            if(cur > nums[i]){
                diff +=1;
                if(cur < nums[n-1] || nums[0] < nums[n-1]) return false;
            }
            if(diff >= 2) return false;
            cur = nums[i];
        }
        return diff < 2;
    }
}
