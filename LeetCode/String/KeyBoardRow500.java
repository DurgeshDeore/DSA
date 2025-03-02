//100.00%
class Solution {
    public boolean isContains(String str,String word){
        int i=1;
        while(i<word.length()){
            if(str.indexOf(word.charAt(i++))==-1){
                return false;
            }
        }
        return true;
    }
    public String[] findWords(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        String[] strs={ "qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM"};
        for(String word: words){
            if(strs[0].indexOf(word.charAt(0)) != -1){
                if(isContains(strs[0], word)){
                    res.add(word);
                }
            }else if(strs[1].indexOf(word.charAt(0)) != -1){
                if(isContains(strs[1], word)){
                    res.add(word);
                }
            }else if(strs[2].indexOf(word.charAt(0)) != -1){
                if(isContains(strs[2], word)){
                    res.add(word);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}
