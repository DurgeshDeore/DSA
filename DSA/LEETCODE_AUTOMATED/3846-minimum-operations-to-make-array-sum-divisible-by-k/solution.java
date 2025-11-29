class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i: nums)
            sum+=i;
        if(sum%k == 0) return 0;
        else if(sum < k) return sum;
        return sum%k;
    }
}
