class Solution {
    public int[] helper(Node root){
        if(root == null) return new int[]{0,0};
        
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        
        int include = root.data + left[1] +right[1];
        int exclude = Math.max(left[0] ,left[1]) + Math.max(right[0] ,right[1]);
        
        return new int[]{include, exclude};
    }
    public int getMaxSum(Node root) {
        int[] res = helper(root);
        return Math.max(res[0], res[1]);
    }
}
