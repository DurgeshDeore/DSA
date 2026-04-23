class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        if(n == 3){
            int sum=0;
            for(int i: nums) sum+=i;
            return sum;
        }
        int second=Integer.MAX_VALUE, third=Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            if(nums[i] < second){
                third = second;
                second = nums[i];
            }else if(nums[i] < third){
                third = nums[i];
            }
        }
        return nums[0]+second+third;
    }
}
