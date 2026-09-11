class Solution {
    public int countDigits(int num) {
        int cnt = 0, n = num;
        int[] freq = new int[10];
        while(n != 0){
            int ld = n % 10;
            freq[ld] += 1;
            n /= 10;
        }
        for(int i=1; i<10; i++){
            if(freq[i] > 0 && (num %i) == 0) cnt += freq[i]; 
        }
        return cnt;
    }
}
