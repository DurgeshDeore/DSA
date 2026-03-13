class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int indx = -1, n = nums.length, max=Integer.MIN_VALUE;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();

        // for(int i=0; i<n; i++){
        //     if(nums[i] > max){
        //         max = nums[i];
        //         indx = i;
        //     }
        // }

        // for(int i=indx; i>=0; i--){
        for(int i=(2)*n-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i%n])
                st.pop();
            if(st.isEmpty())
                res[i%n] = -1;
            else
                res[i%n] = st.peek();
            st.push(nums[i%n]);
        }

        // if(indx != -1){
        //     for(int i=indx+1; i<n; i++) res[i] = max;
        //     res[indx] = -1;
        // }
            
        return res;
    }
}
