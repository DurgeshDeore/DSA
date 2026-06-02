class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for(String word: words){
            int n=word.length(), lst=0;;
            for(int i=0; i<n; i++){
                if(word.charAt(i) == separator){
                    String sub = word.substring(lst, i);
                    if(sub.length() > 0) res.add(sub);
                    lst = i+1;
                }
            }
            String sub = word.substring(lst);
            if(sub.length() > 0) res.add(sub);
        }
        return res;
    }
}
