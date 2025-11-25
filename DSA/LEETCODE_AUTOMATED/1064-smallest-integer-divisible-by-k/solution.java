class Solution {
    public int smallestRepunitDivByK(int k) {
        boolean flag = true;
        if(k == 2 || k == 5) flag=false;
        // String num = "1";
        int rem = 0;
        for(int i=1; i<=k; i++){
            // if(Integer.parseInt(num)%k == 0) return num.length();
            // num += "1";
            rem = (rem*10+1) % k;
            if(rem == 0) return  i;
        }
        return -1;
    }
}
