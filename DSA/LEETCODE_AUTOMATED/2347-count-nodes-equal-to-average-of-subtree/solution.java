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
    int cnt = 0;
    public int[] fun(TreeNode root){
        if(root == null) return new int[]{0, 0};
        int left[] = fun(root.left);
        int right[] = fun(root.right);
        int totalSum = left[0]+right[0]+root.val, totalCnt = left[1]+right[1]+1;
        if((totalSum / totalCnt) == root.val) cnt+=1; 
        return new int[]{totalSum ,totalCnt};
    }
    public int averageOfSubtree(TreeNode root) {
        fun(root);
        return cnt;
    }
}
