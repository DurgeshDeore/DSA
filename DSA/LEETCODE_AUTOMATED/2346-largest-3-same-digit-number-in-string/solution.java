class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder res=new StringBuilder("");
        int max=-1, i=0, n=num.length();
        
        while(i<n-2){
            int digit = num.charAt(i);
            if((digit == num.charAt(i+1)) && (digit == num.charAt(i+2)) && (digit== num.charAt(i))){
                
                if((int)digit-'0' > max) {
                    max = (int)digit-'0';
                    res.setLength(0); // clear previous
                    for (int j = 0; j < 3; j++) {
                        res.append(num.charAt(i));
                    }
                }
            }
            i++;
        }
        return res.toString();
    }
}
