class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        // Brute force: 
        String[] words = sentence.split(" ");
        StringBuilder res = new StringBuilder("");
        Collections.sort(dictionary);
        for(int i=0; i<words.length; i++){
            StringBuilder root = new StringBuilder(words[i]);
            for(String pre: dictionary){
                if(words[i].startsWith(pre)){
                    root = new StringBuilder(pre);
                    break;
                }
            }
            res.append(root);
            if(i != words.length-1) res.append(" ");
        }
        return res.toString();
    }
}
