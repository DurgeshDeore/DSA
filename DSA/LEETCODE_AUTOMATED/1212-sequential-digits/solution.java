class Solution {
    public int getLength(int n){
        int len=0;
        while(n!=0){
            n/=10;
            len+=1;
        }
        return len;
    }
    public List<Integer> sequentialDigits(int low, int high) {
        int mod = 1000000007;
        List<Integer> res = new ArrayList<>();
        // approach 1: use brute force (TLE)
        // for(int i=low; i<=high; i++){
        //     int num = i, prev = Integer.MAX_VALUE;
        //     boolean isValid = true;
        //     while(num != 0){
        //         int ld = num%10;
        //         if(prev != Integer.MAX_VALUE  && ld+1 != prev) {
        //             isValid = false;
        //             break;
        //         }
        //         prev = ld;
        //         num /= 10;
        //     }
        //     if(isValid) res.add(i);
        // }

        // approach 2: build num
        String str = "123456789";
        String start = String.valueOf(low), end = String.valueOf(high);
        for(int len = start.length(); len <= end.length(); len++){
            int l=0;
            for(int r=len; r<10; r++){
                int num = Integer.parseInt(str.substring(l, r));
                if(low <= num && num <= high) res.add(num);
                l+=1;
            }
        }
        return res;
    }
}
