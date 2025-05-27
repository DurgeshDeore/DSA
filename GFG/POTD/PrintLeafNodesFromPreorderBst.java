class Solution {
    public ArrayList<Integer> leafNodes(int[] preorder) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        int n = preorder.length;
        if(n==1){
            res.add(preorder[0]);
            return res;
        }
        for(int i=0; i<n-1; i++){
            int cur = preorder[i], nxt = preorder[i+1];
            boolean flag = false;
            if(cur>nxt){
                stack.push(cur);
            }else{
                while(!stack.isEmpty() && nxt>stack.peek()){
                    stack.pop();
                    flag = true;
                }
                if(flag){
                    res.add(cur);
                }
            }
        }
        res.add(preorder[n-1]);
        return res;
    }
}
