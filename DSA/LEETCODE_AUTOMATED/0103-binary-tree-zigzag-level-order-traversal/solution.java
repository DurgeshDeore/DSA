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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
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

            res.add(curList);
        }

        for(int i=1; i<res.size(); i+=2){ // reverse
            int l = 0, r = res.get(i).size()-1;
            while(l < r){
                int temp = res.get(i).get(l);
                res.get(i).set(l, res.get(i).get(r));
                res.get(i).set(r, temp);
                l++;
                r--;
            }
        }
        return res;
    }
}
