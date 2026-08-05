class TrieNode{
    boolean eow;
    TrieNode[] nodes;
    TrieNode(){
        this.nodes = new TrieNode[26];
        this.eow = false;
    }
}
class WordDictionary {
    TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode cur = root;
        for(char c: word.toCharArray()){
            if(cur.nodes[c-'a'] == null) cur.nodes[c-'a'] = new TrieNode();
            cur = cur.nodes[c-'a'];
        }
        cur.eow = true;
    }
    
    public boolean searchPro(String word, TrieNode cur, int indx){
        if(indx == word.length()) return cur.eow;
        char c = word.charAt(indx);
        if(c == '.') {
            for(int i=0; i<26; i++){
                if(cur.nodes[i] != null){
                    if(searchPro(word, cur.nodes[i], indx+1)) return true;
                }
            }
            return false;
        }
        if(cur.nodes[c-'a'] == null){
            return false;
        }
        return searchPro(word, cur.nodes[c-'a'], indx+1);
    }
    public boolean search(String word) {
        TrieNode cur = root;
        if(word.contains(".")) return searchPro(word, cur, 0);
        for(char c: word.toCharArray()){
            if(cur.nodes[c-'a'] != null){
                cur = cur.nodes[c-'a'];
            }else{
                return false;
            }
        }
        return cur.eow;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
