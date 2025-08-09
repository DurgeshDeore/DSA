class Solution {
    int getLPSLength(String s) {
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
        return lps[n-1];
        // while(i<n && j>0){
        //     String pre=s.substring(0,i+1);
        //     String post=s.substring(j);
        //     if(pre.equals(post)){
        //         res=Math.max(res, i+1);
        //     }
        //     i++;
        //     j--;
        // }
        // return res;
        
    }
}
