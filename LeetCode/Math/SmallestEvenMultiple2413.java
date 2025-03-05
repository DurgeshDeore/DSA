//100.00%
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n==2)return n;
        int ans=0;
        while(true){
            if(n%2==0 && n%2==0){
                ans=n;
                break;
            }
            n*=2;
        }
        return ans;
    }
}
