class Solution {
    Node insert(Node root, int Key) {
        if(root == null) return new Node(Key);
        if(root.data==Key) return root;
        if(root.data>Key){
            root.left=insert(root.left,Key);
        }else{
            root.right=insert(root.right,Key);
        }
        return root;
    }
}
