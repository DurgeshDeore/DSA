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
    int res=0;
    HashMap<Long, Integer> map= new HashMap<>();

    public void backtrack(TreeNode root, int targetSum, Long curSum){
        if(root == null) return;
        
        curSum += root.val;
        if(map.containsKey(curSum-targetSum)) res += map.get(curSum-targetSum);
        map.put(curSum, map.getOrDefault(curSum, 0)+1);

        backtrack(root.left, targetSum, curSum);
        backtrack(root.right, targetSum, curSum);

        // curSum -= root.val;
        map.put(curSum, map.getOrDefault(curSum, 0)-1);
    }
    public int pathSum(TreeNode root, int targetSum) {
        map.put((long)0, 1);
        backtrack(root, targetSum, (long)0);
        return res;
    }
}
