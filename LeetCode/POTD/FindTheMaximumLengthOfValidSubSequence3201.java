class Solution {
    public int maximumLength(int[] nums) {
        int even=0, odd=0, prevE=0, prevO=0;
        for(int i: nums){
            if(i%2 == 0){
                even++;
                prevE = prevO+1;
            }else{
                odd++;
                prevO = prevE+1;
            }
        }
        return Math.max(Math.max(odd, even), Math.max(prevO, prevE));
    }
}
