class Solution {
    public boolean isEven(int num){
        int cnt=0;
        while(num != 0){
            cnt++;
            num/=10;
        }
        return cnt%2==0;
    }
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int num: nums){
            if(isEven(num)){
                res++;
            }
        }
        return res;
    }
}
