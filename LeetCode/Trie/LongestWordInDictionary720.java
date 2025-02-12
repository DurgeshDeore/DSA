class Solution {
    //Node
    class Node{
        Node child[] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i=0; i<26; i++){
                child[i] = null;
            }
        }
    }
    //root
    public Node root= new Node();
    //insert function
    public void insert(String str){
        Node curr = root;
        for(int i=0;i<str.length(); i++){
            int indx = str.charAt(i) - 'a';
            if(curr.child[indx] == null){
                curr.child[indx] = new Node();
            }
            curr = curr.child[indx];
        }
        curr.eow = true;
    }
    //find longestword 
    public String findWord(Node curr ,String str){
        if(curr == null) return str;
        String longStr=str;
        for(int i=0;i<26; i++){
            if(curr.child[i] != null && curr.child[i].eow){
                String newStr=findWord(curr.child[i],str+(char)(i+'a'));
                if(longStr.length()<newStr.length() || (longStr.length()==newStr.length() && newStr.compareTo(longStr)<0)){
                    longStr=newStr;
                }
            }
        }
        return longStr;
    }
    public String longestWord(String[] words) {
        for(String str: words){
            insert(str);
        }
        return findWord(root,"");
    }
}
