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
    public TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode dummy = new TreeNode(-1);
        HashSet<Integer> set = new HashSet<>(); // is child or not
        HashMap<Integer, TreeNode> map = new HashMap<>();  // track the TreeNode
        
        for(int cur[]: descriptions){
            TreeNode parent;
            TreeNode child;
            
            if(!map.containsKey(cur[0])){
                parent = new TreeNode(cur[0]);

                if(map.containsKey(cur[1])) child = map.get(cur[1]);
                else child = new TreeNode(cur[1]);
                
                if(cur[2] == 1) parent.left = child;
                else  parent.right = child;

                // if(!set.contains(cur[0])) dummy = parent;
                
                set.add(cur[1]);
                map.put(cur[0], parent);
                map.put(cur[1], child);
            }else{
                parent = map.get(cur[0]);

                if(map.containsKey(cur[1])) child = map.get(cur[1]);
                else child = new TreeNode(cur[1]);

                if(cur[2] == 1) parent.left = child;
                else parent.right = child;

                // if(!set.contains(cur[0])) dummy = parent;
                set.add(cur[1]);
                map.put(cur[1], child);
            }
        }
        for(int val : map.keySet()){
            if(!set.contains(val)){
                return map.get(val);
            }
        }
        return dummy;
    }
}
