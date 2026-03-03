class Solution {
    public String revInvert(String s){ 
        StringBuilder sb = new StringBuilder("");
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '0')
                sb.append("1");
            else
                sb.append('0');
        }
        return sb.toString();
    }
    public char findKthBit(int n, int k) {
        if(k == 1)
            return '0';

        String[] binary = new String[n];
        binary[0] = "0";

        for(int i=1; i<n; i++){
            StringBuilder sb = new StringBuilder("");
            sb.append(binary[i-1] + "1" + revInvert(binary[i-1])); 
            binary[i] = sb.toString();
        }
        return binary[n-1].charAt(k-1);
    }
}
