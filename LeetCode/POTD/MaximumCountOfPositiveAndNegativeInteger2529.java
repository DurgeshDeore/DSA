//100.00%
class Solution {
    public int maximumCount(int[] nums) {
        int posCnt=0, negCnt=0;
        for(int ele: nums){
            if(ele<0){
                negCnt++;
            }else if(ele>0){
                posCnt++;
            }
        }
        return Math.max(negCnt,posCnt);
    }
}
