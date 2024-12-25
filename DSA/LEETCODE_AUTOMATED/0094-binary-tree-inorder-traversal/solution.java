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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        res=helper(res,root);
        return res;
    }
    public List<Integer> helper(List<Integer> res,TreeNode root) {
        if(root == null){
            return res;
        }
        helper(res,root.left);
        res.add(root.val);
        helper(res,root.right);
        return res;
    }
}
