class Solution {
    public int countCommas(int n) {
        // int size = 0, num = n;
        // while(num != 0){
        //     size += 1;
        //     num /= 10;
        // }
        // if(size < 4) return 0;
        if(n < 1000) return 0;
        return n-999;
    }
}
