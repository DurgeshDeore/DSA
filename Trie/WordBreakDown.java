package Trie;

public class WordBreakDown {
    public static class Node{
        Node child[] = new Node[26];
        boolean eow;
        Node(){
            for(int i=0; i<26; i++){
                this.child[i]=null;
            }
            this.eow=false;
        }
    }
    public static Node root=new Node();
    public static void insert(String str){
        Node curr=root;
        for(int i=0; i<str.length(); i++){
            int indx=str.charAt(i)-'a';
            if(curr.child[indx] == null){
                curr.child[indx]=new Node();
            }
            curr=curr.child[indx];
        }
        curr.eow=true;
    }
    public static boolean search(String key){
        Node curr=root;
        for(int i=0; i<key.length();i++){
            int indx = key.charAt(i)-'a';
            if(curr.child[indx] == null){
                return false;
            }
            curr=curr.child[indx];
        }
        return curr.eow == true;
    }
    public static boolean wordBreakDown(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1;i<=key.length(); i++){
            if(search(key.substring(0,i))  && wordBreakDown(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[]={"i", "like" ,"sam", "samsung" ,"mobile", "ice"};
        for(String str: words){
            insert(str);
        }
        System.err.println("Ans: "+wordBreakDown("ilikesam"));
    }
}
