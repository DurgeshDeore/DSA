class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length, res=0;
        // approach 1: brute force O(n^2)
        // for(int i=0; i<n; i++){
        //     int min = heights[i];
        //     for(int j=i; j<n; j++){
        //         min = Math.min(min, heights[j]);
        //         res = Math.max(res, ((j-i)+1) * min);
        //     }
        // }
        
        // approach 2:
        Stack<Integer> st = new Stack<>(); 
        for(int i=0; i<=n; i++){
            int curHeight = (i==n)? 0: heights[i];
            while(!st.isEmpty() && heights[st.peek()] > curHeight){
                int poped = st.pop();
                int width = st.isEmpty()? i: (i-st.peek()-1);
                res = Math.max(res, heights[poped] * width);
            }
            st.push(i);
        }
        return res;
    }
}
