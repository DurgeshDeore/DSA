class TrieNode{  //make new class
    TrieNode[] nodes= new TrieNode[26];
    boolean eow;

    public TrieNode() {
        for(int i=0; i<26; i++){
            nodes[i] = null;
        }
        eow = false;
    }
}
class Trie {
    
    TrieNode root;
    Trie(){
        root = new TrieNode(); //create the root and initialize in constructor
    }

    public void insert(String word) {
        TrieNode curr = root;
        for(int i=0; i<word.length(); i++){
            int indx = word.charAt(i)-'a';
            if(curr.nodes[indx] == null){
                curr.nodes[indx] = new TrieNode();
                // curr = curr.nodes[indx];
            }
            curr = curr.nodes[indx];
        }
        curr.eow = true;
    }

    public boolean search(String word) {
        TrieNode curr = root;
        int n = word.length();
        for(int i=0; i<n; i++){
            int indx = word.charAt(i)-'a';
            if(curr.nodes[indx] == null){
                return false;
            }
            curr= curr.nodes[indx];
        }
        return curr.eow;
    }

    // Check if a prefix exists in the Trie
    public boolean isPrefix(String word) {
        TrieNode curr = root;
        int n = word.length();
        for(int i=0; i<n; i++){
            int indx = word.charAt(i)-'a';
            if(curr.nodes[indx] ==null){
                return false;
            }
            curr= curr.nodes[indx];
        }
        return true;
    }
}
