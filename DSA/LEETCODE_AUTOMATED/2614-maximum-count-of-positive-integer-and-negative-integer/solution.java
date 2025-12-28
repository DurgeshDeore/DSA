class Solution {
    public int bsn(int[] nums){
        int l =0, r=nums.length;
        while(l<r){
            int m = (r+l)/2;
            if(nums[m] < 0)
                l = m+1;
            else
                r = m;
        }
        return l;
    }
    public int bsp(int[] nums){
        int l =0, r=nums.length;
        while(l<r){
            int m = (r+l)/2;
            if(nums[m] <= 0)
                l = m+1;
            else
                r = m;
        }
        return l;
    }
    public int maximumCount(int[] nums) {
        int neg = bsn(nums), pos = bsp(nums), n = nums.length;
        return Math.max(neg, n-pos);
        // return pos;
    }
}
