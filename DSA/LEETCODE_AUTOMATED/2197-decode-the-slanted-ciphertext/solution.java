class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        
        int n=encodedText.length();
        if(rows == 1 || n==0) return encodedText;

        int m=n/rows, k=0;
        String[] str = new String[rows];
        StringBuilder sb = new StringBuilder("");

        for(int i=m; i<=n; i+=m){
            str[k++] = encodedText.substring(i-m, i); 
        }
        for(int indx1=0; indx1<m; indx1++){
            int i=0, j=indx1;
            while(i<rows && j<m){
                sb.append(str[i].charAt(j));
                i++;
                j++;
            }
        }
        n=sb.length()-1;
        while(sb.charAt(n) ==' ')
            sb.deleteCharAt(n--);
        return sb.toString();
    }
}
