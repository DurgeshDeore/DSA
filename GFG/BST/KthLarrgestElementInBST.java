class Solution {
    List<Integer> lst=new ArrayList<>();
    public List<Integer> helper(List<Integer> res,Node root) {
        if(root == null){
            return res;
        }
        helper(res,root.right);
        res.add(root.data);
        helper(res,root.left);
        return res;
    }
    public int kthLargest(Node root, int k) {
        helper(lst,root);
        int res=-1;
        if(k>lst.size()) return res;
        res=lst.get(k-1);
        return res;
    }
}
