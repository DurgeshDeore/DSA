/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    
    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            Node prev =null;
            for(int i=0; i<n ;i++){
                Node cur = queue.poll();
                if(prev!=null){
                    prev.next=cur;
                }
                prev=cur;
                if(cur.left != null) queue.add(cur.left); 
                if(cur.right != null) queue.add(cur.right);
            }
        }
        return root;

    }
}
