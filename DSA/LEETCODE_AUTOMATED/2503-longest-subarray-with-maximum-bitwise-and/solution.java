class Solution {
    public int longestSubarray(int[] nums) {
        int max=Integer.MIN_VALUE, cnt=0, res=0;
        for(int i: nums) max=Math.max(i, max);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==max){
                cnt+=1;
                res=Math.max(cnt, res);
            }else{
                cnt=0;
            }
        }
        return res;
    }
}
