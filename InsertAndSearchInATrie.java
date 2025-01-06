//method = trie travesal
static void insert(TrieNode root, String key) 
{
    TrieNode curr = root;
    for(int i=0; i<key.length(); i++){
        int indx=key.charAt(i)-'a';
        if(curr.children[indx] == null){
            curr.children[indx] = new TrieNode();
        }
        curr =curr.children[indx];
    }
    curr.isEndOfWord=true;
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    TrieNode curr = root;
    for(int i=0;i<key.length(); i++){
        int indx= key.charAt(i)-'a';
        if(curr.children[indx] == null){
            return false;
        }
        curr=curr.children[indx];
    }
    return curr.isEndOfWord == true;
}
