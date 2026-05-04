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
    TreeNode prev = null;
    int cnt=0, maxCnt=0;
    ArrayList<Integer> lst = new ArrayList<>();
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        if(prev!= null && prev.val == root.val){
            cnt += 1;
        }else{
            prev = root;
            cnt = 1;
        }
        if(cnt > maxCnt){
            lst.clear();
            lst.add(root.val);
            maxCnt = cnt;
        }else if(cnt == maxCnt){
            lst.add(root.val);
        }
        prev = root;
        helper(root.right);
    }
    public int[] findMode(TreeNode root) {
        helper(root);
        int[] res = new int[lst.size()];
        int k=0;
        for(int i: lst) res[k++]= i;
        return res;
    }
}
