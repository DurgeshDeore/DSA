class Trie {
    public class TrieNode{
        TrieNode[] child=new TrieNode[26];
        boolean eow=false;
        TrieNode(){
            Arrays.fill(child,null);
        }
    }
    TrieNode root=new TrieNode();
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
            int indx=word.charAt(i)-'a';
            if(cur.child[indx]==null){
                cur.child[indx]=new TrieNode();
            }
            cur=cur.child[indx];
        }
        cur.eow=true;
    }
    
    public boolean search(String word) {
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
            int indx=word.charAt(i)-'a';
            if(cur.child[indx]==null){
                return false;
            }
            cur=cur.child[indx];
        }
        return cur.eow;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode cur=root;
        for(int i=0;i<prefix.length();i++){
            int indx=prefix.charAt(i)-'a';
            if(cur.child[indx]==null){
                return false;
            }
            cur=cur.child[indx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
