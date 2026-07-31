class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length, j=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && j<n && popped[j] == stack.peek()){
                stack.pop();
                j+=1;
            }
        }
        return stack.isEmpty();
    }
}
