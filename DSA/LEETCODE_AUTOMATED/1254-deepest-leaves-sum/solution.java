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
    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public int getLeavesSum(TreeNode root, int curHeight, int maxHeight){
        if(root == null) return 0;
        if(curHeight == maxHeight) return root.val;
        return getLeavesSum(root.left, curHeight+1, maxHeight) + getLeavesSum(root.right, curHeight+1, maxHeight);
    }
    public int deepestLeavesSum(TreeNode root) {
        int maxHeight = height(root);
        int sum = getLeavesSum(root, 1, maxHeight);
        return sum;
    }
}
