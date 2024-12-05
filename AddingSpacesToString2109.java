//method = use string buffer
class Solution {
    public String addSpaces(String s, int[] spaces) {
        if(s.length() == 0 || spaces.length == 0){
            return s;
        }
        int j=0;
        StringBuffer res= new StringBuffer("");
        for(int i=0; i<s.length(); i++){
            if(j < spaces.length && i == spaces[j]){
                res.append(" ");
                j++;
            }
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}
