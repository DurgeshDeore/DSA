class Solution {
    public int minElement(int[] nums) {
        int n=nums.length, res= nums[0];
        for(int num: nums){
                int cur=0;
                while(num!=0){
                        cur += num%10;
                        num /=10;
                }
                res = Math.min(res, cur);
        }
        return res;
    }
}
