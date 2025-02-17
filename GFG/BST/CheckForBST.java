class Solution {
    boolean helper(Node root,Node min, Node max){
        if(root==null) return true;
        if(min!=null && min.data >= root.data){
            return false;
        }else if(max!=null && max.data <= root.data){
            return false;
        }
        return helper(root.left,min,root) && helper(root.right,root,max);
    }
    boolean isBST(Node root) {
        return helper(root,null,null);
    }
}
