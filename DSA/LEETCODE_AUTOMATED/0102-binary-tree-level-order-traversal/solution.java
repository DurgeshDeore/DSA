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
    public List<List<Integer>> res;

    public List<List<Integer>> levelOrder(TreeNode root) {
        res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> curList = new ArrayList<>();

        // curList.add(root.val);
        queue.add(root);
        // res.add(curList);

        while (!queue.isEmpty()) {
            int levelWidth = queue.size();
            curList = new ArrayList<>();
            
            for(int i=0; i<levelWidth; i++){
                TreeNode cur = queue.poll();
                curList.add(cur.val);
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
            }

            res.add(curList);
        }
        return res;
    }
}
