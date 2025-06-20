class Solution {
    public int maxDistance(String s, int k) {
        int n=0, e=0, so=0, w=0, res=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'E') e++;
            else if(s.charAt(i) == 'W') w++;
            else if(s.charAt(i) == 'N') n++;
            else if(s.charAt(i) == 'S') so++;
            int curMd = Math.abs(n-so) + Math.abs(e-w);
            int steps = i+1;
            int wastedSteps = steps - curMd;
            int extra = 0;
            if(wastedSteps != 0){
                extra = Math.min(2*k, wastedSteps);
            }
            res = Math.max(res, curMd + extra);
        }
        return res;
    }
}
