class Solution {
    public int binaryGap(int n) {
        String num = Integer.toBinaryString(n);
        int l=-1, r=-1, res=0;
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i) == '1'){
                if(l == -1){
                    l=i;
                }else{
                    r=i;
                    res = Math.max(res, r-l);
                    l=r;
                }
            }
        }
        return res;
    }
}
