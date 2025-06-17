// User function Template for Java

class Trie {
    public class TrieNode {
    TrieNode[] nodes = new TrieNode[26];
    boolean eow;
    TrieNode(){
        Arrays.fill(this.nodes, null);
        this.eow = false;
    }
}
    public TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for(char ch: word.toCharArray()){
            int indx = ch-'a';
            if(cur.nodes[indx] == null){
                cur.nodes[indx] = new TrieNode();
            }
            cur = cur.nodes[indx];
        }
        cur.eow = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for(char ch: word.toCharArray()){
            int indx = ch-'a';
            if(cur.nodes[indx] == null){
                return false;
            }
            cur = cur.nodes[indx];
        }
        return cur.eow;
    }

    public boolean isPrefix(String word) {
        TrieNode cur = root;
        for(char ch: word.toCharArray()){
            int indx = ch-'a';
            if(cur.nodes[indx] == null){
                return false;
            }
            cur = cur.nodes[indx];
        }
        return true;
    }
}
