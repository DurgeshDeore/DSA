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
    ArrayList<Integer> vals;
    public void traverse(TreeNode root) {
        if(root == null) return;
        vals.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
    public void fillVals(TreeNode root, int indx) {
        if(indx == vals.size()) return;
        root.right = new TreeNode(vals.get(indx));
        fillVals(root.right, indx+1);
    }
    public TreeNode increasingBST(TreeNode root) {
        vals = new ArrayList<>();
        traverse(root);
        Collections.sort(vals);
        TreeNode newRoot = new TreeNode(-1);
        fillVals(newRoot, 0);
        return newRoot.right;
    }
}
