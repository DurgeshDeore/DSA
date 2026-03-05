class Solution {
    public int minOperations(String s) {
        int res = 0, cnt=0;
        StringBuilder sb = new StringBuilder(s);

        for(int i=1; i<s.length(); i++){
            if(sb.charAt(i-1) == sb.charAt(i)){
                cnt += 1;
                if(sb.charAt(i) == '1')
                    sb.setCharAt(i, '0');
                else
                    sb.setCharAt(i, '1');
            }
        }

        sb = new StringBuilder(s);
        res = cnt;
        cnt = 1;
        if(sb.charAt(0) == '1')
                    sb.setCharAt(0, '0');
                else
                    sb.setCharAt(0, '1');
        
        for(int i=1; i<s.length(); i++){
            if(sb.charAt(i-1) == sb.charAt(i)){
                cnt += 1;
                if(sb.charAt(i) == '1')
                    sb.setCharAt(i, '0');
                else
                    sb.setCharAt(i, '1');
            }
        }

        res = Math.min(cnt, res);
            
        return res;
    }
}
