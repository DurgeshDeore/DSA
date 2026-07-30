class Solution {
    public int minimumFlips(int n) {
        int cnt = 0;
        String num = Integer.toBinaryString(n);
        String rev = new StringBuilder(num).reverse().toString();
        for(int i=0; i<rev.length(); i++){
            if(num.charAt(i) != rev.charAt(i)){
                cnt += 1;
            }
        }
        return cnt;
    }
}
