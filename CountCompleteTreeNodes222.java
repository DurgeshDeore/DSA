//method = recurssion
class Solution {
    public int countNodes(TreeNode root) {
        int rn,ln;
        if(root==null){ //base case
            return 0;
        }
        rn=countNodes(root.right); //no of rigth node
        ln=countNodes(root.left); //no of left node
        return rn+ln+1;  //add 1 for root node
    }
}
