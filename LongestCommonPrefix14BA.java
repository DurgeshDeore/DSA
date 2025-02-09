//method = trie
//better approach
class Solution {
    public class Node{
        Node child[] = new Node[26];
        int freq=0;
        boolean eow=false;
        Node(){
            Arrays.fill(child,null);
        }
    }

    public Node root = new Node(); //root

    public void insert(String str){
        Node curr = root;
        for(int i=0; i<str.length(); i++){
            int indx = str.charAt(i)-'a';
            if(curr.child[indx] == null){
                curr.child[indx] = new Node();
                curr.child[indx].freq=1;
            }else{
                curr.child[indx].freq++;
            }
            curr = curr.child[indx];
        }
        curr.eow = true;
    }
    public StringBuffer res = new StringBuffer("");
    public void findPrefix(Node curr,int len){
        if(root==null) return;
        if(root.freq==1||root.eow) return;
        for(int i=0; i<26; i++){
            if(curr.child[i] != null && curr.child[i].freq==len){
                res.append((char)(i+'a'));
                findPrefix(curr.child[i],len);
            }   
        }
    }
    public String longestCommonPrefix(String[] strs) {
        for(String str: strs){
            insert(str);
        }
        findPrefix(root,strs.length);
        return res.toString();
    }
}
