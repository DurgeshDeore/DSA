//method = math
//optimized solution
class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1; i>=0;i--){
            digits[i]+=carry;
            if(digits[i]>9){
                digits[i]=0;
                carry=1;
            }else{
                return digits;
            }
        }
        if(carry==1){
            int[] res= new int[digits.length+1];
            //int i =0;
            res[0]=carry;
            // for(int ele:digits){
            //     res[i++]=ele;
            // }
            return res;
        }
        return digits;
    }
}
