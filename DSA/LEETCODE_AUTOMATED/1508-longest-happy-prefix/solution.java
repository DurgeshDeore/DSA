class Solution {
    public String longestPrefix(String s) {
        int i=1, n=s.length(), len=0;
        int[] lps=new int[n];
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                lps[i]=++len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return s.substring(0, lps[n-1]);
    }
}
