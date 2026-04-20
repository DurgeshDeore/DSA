class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int res=0;
        for(int num: nums){
            while(num != 0){
                int ld = num%10;
                num /= 10;
                if(ld == digit) res+=1;
            }
        }
        return res; 
    }
}
