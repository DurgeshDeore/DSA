//method = use helper function
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        if(root == null ){ return lst; }
        lst = helper(lst,root);
        return lst;
    }
    public List<Integer> helper(List<Integer> lst, TreeNode root){
        if(root == null){ return lst;}
        lst.add(root.val);
        helper(lst,root.left);
        helper(lst,root.right);
        return lst;
    }
}
