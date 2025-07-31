class Solution {
    public String generateTag(String caption) {
        if(caption == null || caption.trim().isEmpty()) {
            return "#"; 
        }
        StringBuilder res=new StringBuilder("");
        String words[] = caption.trim().split("\\s");
        res.append(words[0].toLowerCase());
        if(words.length>1){
            for(int i=1; i<words.length; i++){
                String word=words[i];
                if(word.length() > 0)
                res.append(Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase());
            }
        }
        caption=res.toString();
        if(caption.length()>=100){
            return "#"+caption.substring(0,99);
        }
        return "#"+caption;
    }
}
