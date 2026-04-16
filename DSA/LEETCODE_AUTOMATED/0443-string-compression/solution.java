class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        if(n == 1) return 1;
        int res=0, i=0;
        while(i<n){
            int cnt = 0;
            char cur = chars[i];
            while(i<n && chars[i] == cur){
                i+=1;
                cnt += 1;
            }
            chars[res++] = cur;
            if(cnt > 1){
                String temp = String.valueOf(cnt);
                for(char c: temp.toCharArray())
                    chars[res++] = c;
            }
        }
        return res;
    }
}
