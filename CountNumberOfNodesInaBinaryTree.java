//method = recurssion
class Solution {

    public static int countNodes(Node root) {
        int rn, ln;
        if(root == null){ //base case
            return 0;
        }
        rn=countNodes(root.right); //count right node
        ln=countNodes(root.left); //count left node
        return rn+ln+1; //add left+right node + root
    }
}
