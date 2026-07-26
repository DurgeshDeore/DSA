class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        if(n == 3) return nums[0] * nums[1] * nums[2];
        // approach 1: sorting
        Arrays.sort(nums);
        int posProd = nums[n-1] * nums[n-2] * nums[n-3];
        int negProd = nums[n-1] * nums[0] * nums[1];
        return posProd > negProd? posProd: negProd;
        // approach 2: find max
        // int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        // int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        // for(int num: nums){
        //     if(num >= max1){
        //         max3 = max2;
        //         max2 = max1;
        //         max1 = num;
        //     }
        //     if(num < min1){
        //         min2 = min1;
        //         min1 = num;
        //     }
        // }
        // int posProd = max1*max2*max3;
        // int negProd = max1*min1*min2;
        // return Math.max(posProd, Math.max(negProd, max1*max2*min1));
    }
}
