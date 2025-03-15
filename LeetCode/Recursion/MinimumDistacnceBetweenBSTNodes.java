//100%
class Solution {
    int diff=Integer.MAX_VALUE;
    TreeNode prev=null;
    public int minDiffInBST(TreeNode root) {
        if(root == null) return 0;
        minDiffInBST(root.left);
        if(prev!=null){
            diff=Math.min(diff, root.val-prev.val);
        }
        prev=root;
        minDiffInBST(root.right);
        return diff;
    }
}
