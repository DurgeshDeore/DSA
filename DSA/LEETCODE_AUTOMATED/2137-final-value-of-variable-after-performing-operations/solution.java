class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(String opr: operations){
            if(opr.equals("X++"))
                res++;
            else if(opr.equals("++X"))
                ++res;
            else if(opr.equals("X--"))
                res--;
            else 
                --res;
        }
        return res;
    }
}
