//method = math
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int a_sum=n*(n+1)/2, sum=0;
        for(int ele: nums){
            sum+=ele;
        }
        return a_sum-sum;
    }
}
