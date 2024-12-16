//method = use helper function (recurssive)
//optimized solution

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        lst = helper(lst, root);
        return lst;
    }
    public List<Integer> helper(List<Integer> lst,TreeNode root) {
        if(root == null){
            return lst;
        }
        helper(lst,root.left);
        helper(lst,root.right);
        lst.add(root.val);
        return lst;
    }
}
