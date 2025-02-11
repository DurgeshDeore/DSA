class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder res = new StringBuilder(s);
        int n=s.length(),m=part.length();
        while(res.indexOf(part)!=-1){
            res.delete(res.indexOf(part),res.indexOf(part)+m);
        }
        return res.toString();
    }
}
