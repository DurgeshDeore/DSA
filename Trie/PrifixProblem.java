//error
package Trie;

public class PrifixProblem {
    public static class  Node {
        Node child[] = new Node[26];
        int freq;
        boolean eow;
        Node(){
            for(int i =0;i<26; i++){
                child[i] = null;
            }
            freq=1;
            eow=false;
        }
    }
    //root 
    public static Node root = new Node();
    //inseert
    public static void insert(String str){
        Node curr= root;
        for(int i=0;i<str.length(); i++){
            int indx = str.charAt(i)-'a';
            if(curr.child[indx] == null){
                curr.child[indx] = new Node();
            }else{
                curr.child[indx].freq++;
            }
            curr= curr.child[indx];
        }
        curr.eow=true;
    }

    //prefix fun
    public static void prefixPro(Node root,String ans){
        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<26; i++){
            if(root.child[i] != null){
                prefixPro(root.child[i], ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        String words[]={"zebra", "dog" ,"dove", "duck" ,"mobile", "ice"};
        for(String str: words){
            insert(str);
        }
        //StringBuffer ans = new StringBuffer("prefix : ");
        prefixPro(root, "");
    }
}
