class Solution {
    int ans=0;
    // public void helper(int n){
    //     while(true){
    //         if(n%2==0 && n%2==0){
    //             ans=n;
    //             return;
    //         }
    //         n*=2;
    //     }
    // }
    public int smallestEvenMultiple(int n) {
        if(n==2)return n;
        //helper(n);
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
