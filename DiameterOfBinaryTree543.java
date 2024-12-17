/**
method =  healper recursive function
optimized solution O(n)
 */
class Solution {
    private int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        helper(root);
        return dia;
    }
    public int helper(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l=helper(root.left);
        int r=helper(root.right);
        dia = Math.max(dia,l+r);
        return Math.max(l,r)+1;
    }
}
