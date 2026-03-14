class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n=arr.length;
        Stack<int[]> st= new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int span =1;
            while(!st.isEmpty() && st.peek()[0] <= arr[i]){
                span += st.pop()[1];
            }
            res.add(span);
            st.add(new int[]{arr[i], span});
        }
        
        return res;
    }
}
