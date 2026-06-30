class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int res=0;
        for(String pat: patterns){
            if(word.contains(pat)) res += 1;
        }
        return res;
    }
}
