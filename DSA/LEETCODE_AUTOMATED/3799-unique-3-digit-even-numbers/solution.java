class Solution {
    public int totalNumbers(int[] digits) {
        int cnt = 0;
        int[] freq = new int[10];

        for(int i: digits) freq[i] += 1;

        for(int num=1; num<10; num++){
            if(freq[num] == 0) continue;
            freq[num] -= 1;
            for(int i=0; i<10; i++){
                if(freq[i] == 0) continue;
                freq[i] -= 1;
                for(int j=0; j<9; j+=2){
                    if(freq[j] > 0) cnt += 1;
                }
                freq[i] += 1;
            }
            freq[num] += 1;
        }
        
        return cnt;
    }
}
