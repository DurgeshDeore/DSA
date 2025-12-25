class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long res = 0, rem = 0;
        int n = happiness.length;
        Arrays.sort(happiness);
        for(int i=n-1; i>=0 && k>0; i--){
            long cur = happiness[i] - rem;
            if(cur <= 0){
                break;
            }
            res += cur;
            rem++;
            k--;
        }
        return res;
    }
}
