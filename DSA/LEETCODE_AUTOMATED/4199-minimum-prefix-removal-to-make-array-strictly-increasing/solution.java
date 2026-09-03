class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        for(int num: nums){
            if(!st.isEmpty() && st.peek() >= num){
                while(!st.isEmpty()) st.pop();
            }
            st.push(num);
        }
        return n-st.size();
    }
}
