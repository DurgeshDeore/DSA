class Solution {
    public boolean increasingTriplet(int[] nums) {
        int one=Integer.MAX_VALUE, two=Integer.MAX_VALUE;
        for(int i: nums){
            if(one >= i){
                one = i;
            }else if(two >= i && i > one){
                two = i;
            }else if(i > two){
                return true;
            }
        }
        return false;
    }
}
