class Solution
{
    String modify(String S)
    {
        StringBuffer result = new StringBuffer("");
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) != ' '){ //only append latters
                result.append(S.charAt(i));
            }
        }
        return result.toString(); //type cast into string
    }
}
