class Solution {
    public boolean helper(TreeNode root, TreeNode min, TreeNode max){
        if(root==null) return true;
        if(min!=null && min.val>=root.val){
            return false;
        }else if(max!=null && max.val<=root.val){
            return false;
        }
        return helper(root.left,min,root) && helper(root.right,root,max);
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
}
