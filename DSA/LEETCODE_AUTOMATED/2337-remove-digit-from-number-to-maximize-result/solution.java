class Solution {
    public String removeDigit(String number, char digit) {
        int n=number.length();
        for(int i=0; i<n-1; i++){
            int c = number.charAt(i);
            if(c == digit && c < number.charAt(i+1)){
                return new String(number.substring(0,i) + number.substring(i+1));
            }
        }
        int last = number.lastIndexOf(digit);
        return number.substring(0, last) + number.substring(last + 1);
    }
}
