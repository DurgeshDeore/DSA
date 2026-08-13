/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
    public TreeNode head;
    public void createTree(TreeNode root, int val){
        if(root == null) return;
        root.val = val;
        createTree(root.left, 2*val+1);
        createTree(root.right, 2*val+2);
    }
    public FindElements(TreeNode root) {
        head = root;
        createTree(root, 0);
    }
    public boolean findUtil(TreeNode root, int target){
        if(root == null) return false;
        if(root.val == target) return true;
        if(findUtil(root.left, target)) return true;
        if(findUtil(root.right, target)) return true;
        return false;
    }
    public boolean find(int target) {
        return findUtil(head, target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
