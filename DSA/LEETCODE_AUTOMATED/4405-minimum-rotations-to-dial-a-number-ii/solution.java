class Solution {
    public int getDist(char prev, char cur){
        int left = Math.abs(prev-cur);
        return Math.min(left, 10-left);
    }
    public int minRotations(int n, String s) {
        // prifix sum 
        char prev = '0';
        int res = Integer.MAX_VALUE, original = 0;
        // int[] prefix = new int[n];
        for(char cur: s.toCharArray()){
            original += getDist(prev, cur);
            prev = cur;
        }
        res = original;
        // Arrays.fill(prefix, curVal);
        int revVal = original - getDist('0',s.charAt(0)) + getDist('0',s.charAt(n-1));
        res = Math.min(original, revVal);
        for(int i=1; i<n; i++){
            int curVal = original - getDist(s.charAt(i-1), s.charAt(i)) + getDist(s.charAt(i-1), s.charAt(n-1));
            res = Math.min(res, curVal);
        }
        return res;
    }
}
