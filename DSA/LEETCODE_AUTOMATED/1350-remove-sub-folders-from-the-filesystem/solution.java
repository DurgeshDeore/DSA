class Solution {
    public Trie root;
    List<String> res;
    public class Trie{
        boolean eow = false;
        int freq = 0;
        Trie[] child = new Trie[27];
        Trie(){
            for(int i=0; i<27; i++) 
                child[i] = null;
        }
    }
    public void insert(String str){
        Trie cur = root;
        for(char c: str.toCharArray()){
            int indx = (c == '/'? 26: c-'a');
            if(cur.child[indx] == null)
                cur.child[indx] = new Trie();
            cur = cur.child[indx];
            cur.freq += 1;
        }
        cur.eow = true;
    }
    public void removeSubFolder(String str, Trie cur){
        for(int i=0; i<27; i++){
            if(cur.child[i] == null)
                continue;
            cur = cur.child[i];
            if(cur.freq > 1 && cur.eow == true) {
                res.add(str);
                return;
            }
            if(i == 26) removeSubFolder(str+'/', cur);
            else removeSubFolder(str+(char)(i+'a'), cur);
        }
    }
    public List<String> removeSubfolders(String[] folder) {
        root = new Trie();
        res = new ArrayList<>();
        // for(String str: folder){
        //     insert(str);
        // }
        // removeSubFolder("", root);
        Arrays.sort(folder);
        String prev = "";
        for(String str: folder){
            if(prev.isEmpty() || !str.startsWith(prev+"/")){
                res.add(str);
                prev = str;
            }
        }
        return res;
    }
}
