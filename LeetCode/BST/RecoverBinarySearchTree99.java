class Solution {
    public void swap(TreeNode n1, TreeNode n2){
        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;
    }
    public TreeNode max(TreeNode root, TreeNode max) {
        if(root == null) return max;
        if(root.val > max.val) max = root;
        max = max(root.left, max);
        max= max(root.right, max);
        return max;
    }
    public TreeNode min(TreeNode root, TreeNode min) {
        if(root == null) return min;
        if(root.val < min.val) min = root;
        min=min(root.left, min);
        min=min(root.right, min);
        return min;
    }
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        TreeNode maxNode = max(root.left, root.left);
        TreeNode minNode = min(root.right, root.right);
        if(maxNode != null && minNode != null){
            if(root.val > minNode.val && root.val < maxNode.val){
                swap(minNode, maxNode);
            }
        }
        if(maxNode != null){
            if(root.val < maxNode.val){
                swap(root, maxNode);
            }
        }
        if(minNode != null) {
            if(root.val > minNode.val){
                swap(root, minNode);
            }
        }
        recoverTree(root.left);
        recoverTree(root.right);
    }
}
