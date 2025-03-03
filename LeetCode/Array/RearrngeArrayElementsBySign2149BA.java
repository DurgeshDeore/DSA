//46.97 %
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0, neg=1, n=nums.length;
        int res[] = new int[n];
        for(int i=0; i<n; i++){
            int sign=nums[i]<0? -1: 1;
            if(1==sign){
                res[pos]=nums[i];
                if(pos+2<=n){
                    pos+=2;
                }
            }else{
                res[neg]=nums[i];
                if(neg+2<=n){
                    neg+=2;
                }
            }
        }
        return res;
    }
}
