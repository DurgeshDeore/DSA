class Solution {
    public int hammingWeight(int n) {
        // int res = 0;
        // String num = Integer.toBinaryString(n);
        // for(char i: num.toCharArray()){
        //     if(i == '1') res += 1;
        // }
        // return res;
        return Integer.bitCount(n);
    }
}
