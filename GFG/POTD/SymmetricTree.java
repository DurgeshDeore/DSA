class Solution {
    public boolean helper(Node root1, Node root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.data != root2.data) return false;
        boolean left = helper(root1.left, root2.right);
        boolean right = helper(root1.right, root2.left);
        return left && right;
    }
    public boolean isSymmetric(Node root) {
        if(root.left == null && root.right == null){
            return true;
        }
        return helper(root.left, root.right);
    }
}
