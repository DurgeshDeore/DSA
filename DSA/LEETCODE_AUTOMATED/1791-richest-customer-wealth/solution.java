class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for(int i[]: accounts){
            int sum=0;
            for(int a: i) 
                sum += a;
            res = Math.max(res, sum);
        }
        return res;
    }
}
