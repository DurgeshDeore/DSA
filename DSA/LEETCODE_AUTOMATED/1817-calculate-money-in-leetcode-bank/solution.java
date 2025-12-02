class Solution {
    public int totalMoney(int n) {
        int res = 0;
        // int[] temp = new int[7];
        int cnt = 1, cur = 1;
        // temp[0]
        for(int i=0; i<n; i++){
            res += cur;
            cur+=1;
            if((i+1)%7 == 0){
                cnt += 1;
                cur = cnt;
            }
        }
        return res;
    }
}
