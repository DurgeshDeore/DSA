//find lenght of largest prefix in trie
package Trie;

public class LongestWordPrefix {
    public static class Node{
        Node[] child = new Node[26];
        boolean eow = false;
        int freq=0;
        Node(){
            for(int i=0;i<26; i++){
                child[i]=null;
            }
            eow =false;
            freq=1;
        }
    }
    public static Node root= new Node();

    public static void insert(String str){
        Node curr=root;
        for(int i=0; i<str.length(); i++){
            int indx=str.charAt(i)-'a';
            if(curr.child[indx] == null){
                curr.child[indx]=new Node();
            }else{
                curr.freq++;
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
    
    public static int prefixLen(Node root,int len){
        if(root == null){
            return len;
        }
        if(root.freq == 1 && root.eow != false){
            System.out.println("Length of prefix "+len);
            return len;
        }
        for(int i=0; i<26; i++){
            if(root.child[i] != null){
                len++;
                prefixLen(root.child[i], len);
            }
        }
        return len;
    }

    public static void prefixWord(Node root,StringBuffer ans){
        if(root == null){
            return ;
        }
        // if(root.freq == 1){
            
        //     return ;
        // }
        for(int i=0; i<26; i++){
            if(root.child[i] != null && root.eow == false){
                ans.append((char)(i+'a'));
                prefixWord(root.child[i], ans);
            }
            if(root.freq ==1){
                System.out.println("Prefix "+ans);
                ans=new StringBuffer("");
            }
        }
        return;
    }

    public static void main(String[] args) {
        String strings[] ={ "app", "aple", "mango","man","woman"};
        for(String str: strings){
            insert(str);
        }
        StringBuffer ans=new StringBuffer("");
        prefixLen(root,0);
        prefixWord(root, ans);
        
    }
}
