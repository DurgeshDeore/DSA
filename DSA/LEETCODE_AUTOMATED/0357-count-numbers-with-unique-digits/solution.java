class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        long curUnique = 9, uniqueDigits = 10, availbleDigits = 9, num = (long)Math.pow(10, n); 
        for(int i=2; i<=n && availbleDigits > 0; i++){
            curUnique *= availbleDigits;
            uniqueDigits += curUnique; 
            availbleDigits -= 1;
        }
        return (int)(Math.pow(10, n) - (num-uniqueDigits));
    }
}
