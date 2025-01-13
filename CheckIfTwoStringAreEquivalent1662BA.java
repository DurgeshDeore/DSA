//method =  strring manupulation
//better approach
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder("");
        StringBuilder w2 = new StringBuilder("");
        for(String str: word1){
            for(char ch: str.toCharArray()){
                w1.append(ch);
            }
        }
        for(String str: word2){
            for(char ch: str.toCharArray()){
                w2.append(ch);
            }
        }
        if(w1.toString().equals(w2.toString())){
            return true;
        }
        return false;
    }
}
