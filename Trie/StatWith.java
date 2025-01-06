package Trie;

public class StatWith {
    public static class Node{
        Node[] child = new Node[26];
        boolean eow = false;
        Node(){
            for(int i=0;i<26; i++){
                child[i]=null;
            }
        }
    }
    public static Node root= new Node();
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
        for(int i=0;i<key.length();i++){
            int indx = key.charAt(i)-'a';
            if(curr.child[indx] == null){
                return false;
            }
            curr=curr.child[indx];
        }
        return curr.eow == true;
    }
    //find prefix
    public static boolean startWith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int indx = prefix.charAt(i)-'a';
            if(curr.child[indx] == null){
                return false;
            }
            curr=curr.child[indx];
        }
        return true;
    }
    public static void main(String[] args) {
        String strings[] ={ "app", "apple", "mango","man","woman"};
        for(String str: strings){
            insert(str);
        }
        // System.err.println(search("rajesh"));
        System.out.println(startWith("mam"));
    }
}

