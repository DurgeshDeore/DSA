class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] nge = new int[n];
        int[] pge = new int[n];
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        // for(int i=n-1; i>=0; i--){
        //     while(!st.isEmpty() && heights[st.peek()] <= heights[i])
        //         st.pop();
        //     if(st.isEmpty())
        //         nge[i]=n;
        //     else
        //         nge[i] = st.peek();
        //     st.push(i);
        // }
        
        for(int i=n-1; i>=0; i--){
            int cnt=0;
            while(!st.isEmpty() && st.peek() <= heights[i]){
                st.pop();
                cnt++;
            }
                
            if(!st.isEmpty())
                cnt++;
            res[i] = cnt;
            st.push(heights[i]);
        }

        // for(int i=0; i<n-1; i++){
        //     int max = heights[i+1], cnt=1;
        //     for(int j=i+1; j<nge[i]; j++){
        //         if(max > heights[j])
        //             break;
        //         else
        //             cnt += 1;
        //         max = Math.max(max, heights[j]);
        //     }
        //     res[i] = cnt;
        // }
        return res;
    }
}
