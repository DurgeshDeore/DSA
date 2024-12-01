//method = reccursion
class Solution {
    public int maxDepth(TreeNode root) {
        int rn, ln;
        if(root == null){
            return 0;
        }
        rn=maxDepth(root.right); //count left nodes
        ln=maxDepth(root.left); //count right nodes
        return rn>=ln? (rn+1): (ln+1); 
    }
}
