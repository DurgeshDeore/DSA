//98.20%
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] lsum = new int[n];
        int[] rsum = new int[n];
        int[] res = new int[n];
        for(int i=1; i<n ;i++ ){
            lsum[i]=lsum[i-1]+nums[i-1];
            rsum[n-i-1] = rsum[n-i]+nums[n-i];
        }

        for(int i=0; i<n; i++){
            if(rsum[i]>lsum[i]){
                res[i]=rsum[i]-lsum[i];
            }else{
                res[i]=lsum[i]-rsum[i];
            }
        }
        return res;
    }
}
