class Solution {
    public boolean isValid(int num){
        Stack<Integer> st = new Stack<>();
        while(num != 0){
            int ld = num % 10;
            if(!st.isEmpty() && st.peek() < ld) return false;
            st.push(ld);
            num /= 10;
        }
        return true;
    }
    public int monotoneIncreasingDigits(int n) {
        if(n <= 10) return (n==10)? 9: n;
        if(isValid(n)) return n;
        // Brute force TLC (208/308)
        // int num = n;
        // while(num != 0){
        //     if(isValid(num)) break;
        //     num-=1;
        // }
        // return num;

        // generate number 
        char[] digits = String.valueOf(n).toCharArray();
        int ptr = 0, m = digits.length;
        for(int i=m-1; i>0; i--){
            if(digits[i-1] > digits[i]){
                ptr = i;
                digits[i-1]--;
            }
        }
        for(int i=ptr; i<m; i++) digits[i] = '9';
        return Integer.parseInt(new String(digits));
    }
}
