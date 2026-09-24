class Solution {
    public int smallestIndex(int[] nums) {
        int res = -1;
        for(int i=0; i<nums.length; i++){
            int dSum = 0, num = nums[i];
            while(num != 0){
                dSum += num%10;
                num /= 10;
            }
            if(dSum == i) return i;
            
        }
        return res;
    }
}
