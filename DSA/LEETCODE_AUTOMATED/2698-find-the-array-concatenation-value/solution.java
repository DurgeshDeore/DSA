class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        int l=0, r=n-1;
        long res = 0;
        while(l<=r){
            if(l == r){
                res += nums[l];
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(nums[l]);
            sb.append(nums[r]);
            res += Long.valueOf(sb.toString());
            l++;
            r--;
        }
        return res;
    }
}
