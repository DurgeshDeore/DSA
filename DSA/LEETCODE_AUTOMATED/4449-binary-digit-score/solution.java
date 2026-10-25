class Solution {
    public int calculateScore(int a, int b) {
        int b1 = Integer.bitCount(a), b2 =  Integer.bitCount(b);
        return (b1 >= b2)? b1 * b2: b2 / b1;
    }
}
