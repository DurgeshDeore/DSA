class Solution {
    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for(String str: sentences){
            String[] ch = str.split(" ");
            res = Math.max(res, ch.length);
        }
        return res;
    }
}
