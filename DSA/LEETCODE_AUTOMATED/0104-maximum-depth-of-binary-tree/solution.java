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
    public int maxDepth(TreeNode root) {
        int rn, ln;
        if(root == null){
            return 0;
        }
        rn=maxDepth(root.right);
        ln=maxDepth(root.left);
        return rn>=ln? (rn+1): (ln+1);
    }
}
