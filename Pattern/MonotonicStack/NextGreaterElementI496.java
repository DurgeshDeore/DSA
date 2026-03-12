class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        Stack<Integer> st = new Stack<>();
        // int[] nge = new int[n];
        Map<Integer, Integer>  map = new HashMap<>();
        for(int i=n-1; i>=0; i--){
            if(i == n-1){
                map.put(nums2[i], -1);
            }else{
                while(!st.isEmpty() && st.peek() <= nums2[i])
                    st.pop();
            }
            if(st.isEmpty())
                map.put(nums2[i], -1);
            else
                map.put(nums2[i], st.peek());
            st.push(nums2[i]);
        }
        int j=0;
        int[] res = new int[nums1.length];
        for(int i: nums1){
            res[j++] = map.get(i);
        }
        return res;
    }
}
