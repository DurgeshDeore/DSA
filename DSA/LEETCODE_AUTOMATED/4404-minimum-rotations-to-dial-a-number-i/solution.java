class Solution {
    public int minRotations(String s) {
        char prev = '0';
        int res = 0;
        for(char cur: s.toCharArray()){
            // if(prev == cur) continue;
            int left = Math.abs(prev-cur), right = (prev+('9'-cur)+1);
            res += Math.min(left, 10-left);
            prev = cur;
        }
        return res;
    }
}
