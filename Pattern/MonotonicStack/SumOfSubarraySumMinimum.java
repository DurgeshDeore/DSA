class Solution {
    public int[] nSEE(int[] arr){
        int n = arr.length; 
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            nse[i] = st.isEmpty()? n: st.peek();
            st.push(i);
        }
        
        return nse;
    }
    public int[] pSE(int[] arr){
        int n = arr.length; 
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) st.pop();
            pse[i] = st.isEmpty()? -1: st.peek();
            st.push(i);
        }
        
        return pse;
    }
    public int sumSubMins(int[] arr) {
        long sum = 0;
        int n = arr.length; 
        int[] nse = nSEE(arr);
        int[] pse = pSE(arr);
        for(int i=0; i<n; i++){
            int left = i-pse[i], right=nse[i]-i;
            sum += (long)left * right * arr[i];
        }
        return (int)sum;
    }
}
