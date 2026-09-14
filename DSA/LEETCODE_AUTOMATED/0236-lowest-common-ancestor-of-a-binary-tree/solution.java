/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode one, two;
    public TreeNode res = new TreeNode(-1);
    public boolean findAnce(TreeNode root, boolean[] vis){
        if(root == null) return false;
        if(root.val == one.val) vis[0] = true;
        else if(root.val == two.val) vis[1] = true;
        if(vis[0] && vis[1]) return true;
        if(findAnce(root.left, vis)) return true;
        if(findAnce(root.right, vis)) return true;
        return false;
    }
    public void dfs(TreeNode root){
        if(root == null) return;
        if(findAnce(root, new boolean[2])) res = root;
        dfs(root.left);
        dfs(root.right); 
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //  try all the nodes and update based on lca 
        // TLC (32/33)
        // one = p;
        // two = q;
        // dfs(root);
        if(root == null || root == q || root == p) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null) return root;
        return left != null? left: right;
    }
}
