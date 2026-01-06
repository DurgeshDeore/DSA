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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return -1; 
        Queue<TreeNode> q = new LinkedList<>();
        int cur = 0, max = Integer.MIN_VALUE, level = 0, res = 1;
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            cur = 0;
            level += 1;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                cur += node.val;
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            if (cur > max) {
                res = level;
                max = cur;
            }
        }
        return res;
    }
}
