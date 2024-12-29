//optimized solution
class Solution {
    public int minimumOperations(int[] nums) {
        int cnt=0;
        for(int num: nums){
            if(num == 1){
                cnt++;
            }else if(num%3 == 2){
                cnt++;
            }else if(num%3 == 1){
                cnt++;
            }
        }
        return cnt;
    }
}
