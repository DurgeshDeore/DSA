class Solution {
    public int numSub(String s) {
        long mod = 1_000_000_007, res = 0, cnt=0;
        for(char ch: s.toCharArray()){
            if(ch == '1'){
                cnt += 1;
                // res += (cnt+1)*cnt/2;
                res = (res+cnt)%mod;
            }else{
                cnt = 0;
            }
        }
        return (int)res;
    }
}
