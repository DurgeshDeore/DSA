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
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();

    public void backtrack(TreeNode root, int targetSum, int curSum){
        if(root == null) return;
        
        curSum += root.val;
        cur.add(root.val);

        if(curSum == targetSum && (root.left == null && root.right == null)) res.add(new ArrayList<>(cur));

        backtrack(root.left, targetSum, curSum);
        backtrack(root.right, targetSum, curSum);

        curSum -= root.val;
        cur.remove(cur.size()-1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        backtrack(root, targetSum, 0);
        return res;
    }
}
