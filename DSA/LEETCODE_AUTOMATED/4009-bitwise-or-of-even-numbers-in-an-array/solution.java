class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int res = 0;
        for(int i: nums){
            if(i%2==0)
                res |= i;
        }
        return res;
    }
}
