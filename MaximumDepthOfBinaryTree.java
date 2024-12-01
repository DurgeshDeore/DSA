//method = recursion
class Solution {
  public static int maxDepth(Node root) {
    int rn, ln;
    if(root == null){
        return 0;
    }
    rn=maxDepth(root.right);
    ln=maxDepth(root.left);
    return rn>=ln? rn+1: ln+1;
  }
}
