class Solution {
    Node min = new Node(Integer.MIN_VALUE);
    Node max = new Node(Integer.MAX_VALUE);
    public void helper(Node root, int key) {
        if(root == null) return;
        if(root.data < key && root.data > min.data){
            min = root;
            min.data = root.data;
        }
        if(root.data > key && root.data < max.data){
            max = root;
            max.data = root.data;
        }
        helper(root.left, key);
        helper(root.right, key);
    }
    public ArrayList<Node> findPreSuc(Node root, int key) {
        ArrayList<Node> res = new  ArrayList<>();
        helper(root, key);
        if(min.data == Integer.MIN_VALUE){
            res.add(null);
        }else{
            res.add(min);
        }
        if(max.data == Integer.MAX_VALUE){
            res.add(null);
        }else{
            res.add(max);
        }
        return res;
        
    }
}
