class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = (s.length()%k > 0)? (s.length()/k)+1: (s.length()/k), m = s.length(), i=0, j=0;
        String[] res = new String[n];
        for(; i<m; i+=k){
            if(j<n && i+k <= m){
                res[j++] = s.substring(i, i+k);
            }
        }
        if(j<n){
            String sub = s.substring(m-(m%k), m);
            while(sub.length() < k) sub += fill;
            res[j] = sub;
        }
        return res;
    }
}
