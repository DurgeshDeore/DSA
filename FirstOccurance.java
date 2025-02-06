class Solution {
    int firstOccurence(String txt, String pat) {
        for(int i=0; i<txt.length()-pat.length()+1; i++){
            if(txt.substring(i,i+pat.length()).equals(pat)){
                return i;
            }
        }
        return -1;
    }
}
