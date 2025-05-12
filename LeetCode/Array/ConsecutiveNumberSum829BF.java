class Solution {
    public int consecutiveNumbersSum(int n) {
        int cnt = 1, sum=0, end=1,start=1;
        for(;start < n-1;start++){
            end=start+1;
            sum=start+end;
            while(sum<n){
                end++;
                sum+=end;
            }
            if(sum==n) cnt++;
            
        }
        return cnt;
    }
}
