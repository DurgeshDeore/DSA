class Solution {
    ArrayList<Integer> helper(Node root, ArrayList<Integer> res) {
        if(root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            for(int i=0; i<n; i++){
                Node temp = queue.poll();
                if(i == 0) res.add(temp.data);
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
        }
        return res;
    }
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        return helper(root, res);
    }
}
