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
class Solution {
    public int good;
    public void traverse(TreeNode root, int maxval){
        if(root == null) return;
        if(maxval <= root.val){
            maxval = root.val;
            good += 1;
        }
        traverse(root.left, maxval);
        traverse(root.right, maxval);
    }
    public int goodNodes(TreeNode root) {
        good = 0;
        traverse(root, Integer.MIN_VALUE);
        return good;
    }
}
