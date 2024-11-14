//method = using bruteforce
class Solution {
    static int minJumps(int[] arr) {
        int currJumps = arr[0], maxJumps=0;
        int i=0,n=arr.length;
        if(currJumps>=n){
            return 1;
        }
        while(i<n){
            currJumps = arr[i];
            if(currJumps>=n){
                return maxJumps; 
            }
            i+=currJumps; //increament i by arr[i] postitions
            maxJumps++; //increament jumps by 1
        }
        return maxJumps;
    }
}
