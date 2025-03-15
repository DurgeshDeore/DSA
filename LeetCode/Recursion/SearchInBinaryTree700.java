//100%
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(val == root.val){
            return root;
        }
        return val<root.val? searchBST(root.left,val): searchBST(root.right,val);
    }
}
