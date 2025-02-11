class Solution {
    public class Node{
        Node[] child= new Node[26];
        boolean eow=false;
        Node(){
            Arrays.fill(child,null);
        }
        int freq=0;
    }
    public Node root = new Node();
    public void insert(String str){
        Node cur=root;
        for(int i=0;i<str.length();i++){
            int indx=str.charAt(i)-'a';
            if(cur.child[indx]==null){
                cur.child[indx]=new Node();
                cur.child[indx].freq=1;
            }else{
                cur.child[indx].freq+=1;
            }
            cur=cur.child[indx];
        }
        cur.eow=true;
    }
    public String prefix="";
    public void findPrefix(Node cur,int len,StringBuilder ans){
        if(cur==null) return;
        for(int i=0;i<26;i++){
            if(cur.child[i] != null && cur.child[i].freq==len){
                char ch=(char)(i+'a');
                ans.append(ch);
                if(prefix.length() <= ans.length()){
                    prefix=ans.toString();
                }
                findPrefix(cur.child[i],len,ans);
                ans.deleteCharAt(ans.length()-1);
            }
        }
    }
    public String longestCommonPrefix(String arr[]) {
        for(String str: arr) insert(str);
        findPrefix(root,arr.length,new StringBuilder(""));
        return prefix;
    }
}
