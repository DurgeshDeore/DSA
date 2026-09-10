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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // recursion also works
        // Stack
        List<List<Integer>> res = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> curList = new ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int levelWidth = queue.size();
            curList = new ArrayList<>();
            
            for(int i=0; i<levelWidth; i++){
                TreeNode cur = queue.poll();
                curList.add(cur.val);
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
            }

            stack.add(curList);
        }

        while(!stack.isEmpty()) res.add(stack.pop());

        return res;
    }
}
