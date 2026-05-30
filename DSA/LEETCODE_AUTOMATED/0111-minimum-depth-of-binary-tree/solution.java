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
    // public int res = Integer.MAX_VALUE;
    public int getHeight(TreeNode root, int height){
        if(root == null) return Integer.MAX_VALUE;
        if(root.left == null && root.right == null){
            // res = Math.min(res, Math.min(left, right));
            return height;
        };
        return Math.min(
            getHeight(root.left, height+1),
            getHeight(root.right, height+1)
        );
    }
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return getHeight(root, 1);
        // return res;
    }
}
