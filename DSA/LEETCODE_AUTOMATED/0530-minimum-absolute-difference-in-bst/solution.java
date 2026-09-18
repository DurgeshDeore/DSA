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
    public int minDiff = Integer.MAX_VALUE;
    public PriorityQueue<Integer> pq = new PriorityQueue<>();
    public void dfs(TreeNode root){
        if(root == null) return;
        pq.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return 0;
        dfs(root);
        int prev = pq.poll();
        while(!pq.isEmpty()){
            int next = pq.poll();
            minDiff = Math.min(minDiff, next-prev);
            prev=next;
        }
        return minDiff;
    }
}
