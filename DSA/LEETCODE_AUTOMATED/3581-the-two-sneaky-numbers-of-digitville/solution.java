class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length, j = 0;
        int res[] = new int[2];
        int temp[] = new int[n-1];
        for(int i: nums)
            temp[i]++;
        for(int i=0; i<n-1; i++){
            if(temp[i]>=2)
                res[j++]=i;
        }
        return res;
    }
}
