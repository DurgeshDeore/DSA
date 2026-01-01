class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length, carry = 1;
        for(int i=n-1; i>=0; i--){
            digits[i] += carry;
            if(digits[i] > 9){
                digits[i] = 0;
            }else{
                return digits;
            }
        }
        int[] res = new int[n+1];;
        if(carry == 1){
            res[0] = 1;
        }
        return res;
    }
}
