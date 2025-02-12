class Solution {
    ArrayList<Integer> temp=new ArrayList<>();
    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        temp.add(root.data);
        inorder(root.right);
    }
    public int kthSmallest(Node root, int k) {
        inorder(root);
        int res=-1;
        if(temp.size()<k) return res;
        for(int i=0;i<k;i++){
            res=temp.get(i);
        }
        return res;
    }
}
