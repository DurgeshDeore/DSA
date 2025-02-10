//method = monotonic stack
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> res=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++) res.add(-1);
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && a[i]<=stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                res.set(i,stack.peek());
            }
            stack.push(a[i]);
        }
        return res;
    }
}
