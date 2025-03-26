//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String line = sc.nextLine();
            String[] dictionary = line.split(" ");

            Solution obj = new Solution();
            if (obj.wordBreak(s, dictionary)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    
    public class Node{
        Node child[] = new Node[26];
        boolean eow = false;
        Node(){
            Arrays.fill(child,null);
            eow =false;
        }
    }
    
    public Node root = new Node();
    
    public void insert(String s){
        Node cur = root;
        for(int i=0; i<s.length(); i++){
            int indx = s.charAt(i)-'a';
            if(cur.child[indx] == null){
                cur.child[indx] = new Node();
            }
            cur = cur.child[indx];
        }
        cur.eow = true;
    }
    
    // public boolean startWith(String key){
    //     Node cur = root;
    //     for(int i=0; i<key.length(); i++){
    //         int indx = key.charAt(i)-'a';
    //         if(cur.child[indx] == null){
    //             return false;
    //         }
    //         cur = cur.child[indx];
    //     }
    //     return true;
    // }
    public boolean startWith(String s) {
        return wordBreakHelper(s, 0, new Boolean[s.length()]);
    }

    private boolean wordBreakHelper(String s, int start, Boolean[] memo) {
        if (start == s.length()) return true;
        if (memo[start] != null) return memo[start];

        Node cur = root;
        for (int i = start; i < s.length(); i++) {
            int indx = s.charAt(i) - 'a';
            if (cur.child[indx] == null) return memo[start] = false;

            cur = cur.child[indx];
            if (cur.eow && wordBreakHelper(s, i + 1, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }
    
    public boolean wordBreak(String s, String[] dictionary) {
        for(String str: dictionary){
            insert(str);
        }
        return startWith(s);
    }
}
