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
    public List<String> constructPaths(TreeNode root, String temp,List<String> res){
        if(root == null) return res;
        temp += root.val;
        if(root.left == null && root.right == null){
            res.add(temp);
        }else{
            temp+="->";
            constructPaths(root.left, temp, res);
            constructPaths(root.right, temp, res);
        }
        return res;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        constructPaths(root, "", res);
        return res;
    }
}
