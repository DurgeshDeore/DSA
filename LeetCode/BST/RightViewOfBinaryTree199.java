class Solution {
    public List<Integer> helper(TreeNode root, List<Integer> res){
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            
            int n=queue.size();
            for(int i=0; i<n ;i++){
                TreeNode temp = queue.poll();
                if(i==0) res.add(temp.val);
                if(temp.right != null) queue.add(temp.right); 
                if(temp.left != null) queue.add(temp.left); 
            }
        }
        return res;
    }
    public List<Integer> rightSideView(TreeNode root) {
        return helper(root, new ArrayList<>());
    }
}
