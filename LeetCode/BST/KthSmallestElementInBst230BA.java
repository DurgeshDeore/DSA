class Solution {
    List<Integer> lst=new ArrayList<>();
    public List<Integer> helper(List<Integer> res,TreeNode root) {
        if(root == null){
            return res;
        }
        helper(res,root.left);
        res.add(root.val);
        helper(res,root.right);   
        return res;
    }
    public int kthSmallest(TreeNode root, int k) {
        helper(lst,root);
        int res=-1;
        if(k>lst.size()) return res;
        // for(int i=0;i<k;i++){
        //     res=lst.get(i);
        // }
        res=lst.get(k-1);
        return res;
    }
}
