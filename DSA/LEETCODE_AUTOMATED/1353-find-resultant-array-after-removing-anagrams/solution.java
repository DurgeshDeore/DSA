class Solution {
    public String sortedSignature(String str){
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        res.add(words[0]);
        String sign = sortedSignature(words[0]);
        for(int i=1; i<words.length; i++){
            String word= words[i];
            String curSign = sortedSignature(word);
            if(!sign.equals(curSign)){
                res.add(word);
                sign = sortedSignature(word);
            }
        }
        return res;
    }
}
