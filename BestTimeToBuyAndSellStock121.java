//method = two variable
//better appraoch
class Solution {
    public int maxProfit(int[] prices) {
        int maxProf=0, minValue=Integer.MAX_VALUE;
        for(int i: prices){
            minValue=Math.min(minValue,i);
            int prof=i-minValue;
            maxProf=Math.max(maxProf,prof);
        }
        return maxProf;
    }
}
