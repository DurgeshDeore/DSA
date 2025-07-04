class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            stack.push(cur);
            if(cur.right != null)  queue.add(cur.right);
            if(cur.left != null)  queue.add(cur.left);
        }
        while(!stack.isEmpty()) res.add(stack.pop().data);
        return res;
    }
}
