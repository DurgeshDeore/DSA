class Solution {
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        if(n == 1) return res.toString();
        for(int i=0; i<n-1; i++){
            StringBuilder curSb = new StringBuilder();
            int cnt = 0, j = 0, m = res.length();
            char curCh = m > 0? res.charAt(0): 'a';
            while(j<m){
                while(j<m && res.charAt(j) == curCh ) {
                    j += 1;
                    cnt += 1;
                }
                curSb.append(cnt);
                curSb.append(curCh);
                cnt = 0;
                if(j<m) curCh = res.charAt(j);
            }
            res = new StringBuilder(curSb.toString());
        }
        return res.toString();
    }
}
