//method = trie
//better appoach
class Solution {
    public class Node{
        Node[] child=new Node[26];
        boolean eow=false;
        Node() {
            Arrays.fill(child, null);
        }
    }
    public Node root= new Node();
    public void insert(String str){
        Node cur=root;
        for(int i=0;i<str.length();i++){
            int indx=str.charAt(i)-97;
            if(cur.child[indx]==null){
                cur.child[indx]=new Node();
            }
            cur=cur.child[indx];
        }
        cur.eow=true;
    }
    public boolean search(String str){
        Node cur=root;
        for(int i=0;i<str.length();i++){
            int indx=str.charAt(i)-97;
            if(cur.child[indx]==null){
                return false;
            }
            cur=cur.child[indx];
        }
        return cur.eow;
    }
    public boolean helper(String str,int j,HashMap<Integer,Boolean> map){
        if(j==str.length()) return true;
        if(map.containsKey(j)) return map.get(j);
        for(int i=j+1;i<=str.length();i++){
            
            if(search(str.substring(j,i)) && helper(str,i,map)){
                map.put(j,true);
                return true;
            }
        }
        map.put(j,false);
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        for(String str: wordDict){
            insert(str);
        }
        return helper(s,0,new HashMap<>());
    }
}
