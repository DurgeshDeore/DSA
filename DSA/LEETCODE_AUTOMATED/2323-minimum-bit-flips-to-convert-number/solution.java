class Solution {
    public int minBitFlips(int start, int goal) {
        // int cnt = 0;
        // String a = Integer.toBinaryString(start);
        // String b = Integer.toBinaryString(goal);

        // for(int i=0; i<Math.min(a.length(), b.length()); i++){
        //     if(a.charAt(i) != b.charAt(i)) cnt += 1;
        // }

        // return cnt;
        int xor = start^goal;
        return Integer.bitCount(xor);
    }
}
