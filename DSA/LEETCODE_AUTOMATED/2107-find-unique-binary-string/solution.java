class Solution {
    public String helper(Set<String> set, StringBuilder cur, int indx, int n){
        if(indx >= n || indx < 0)
            return null;

        if(!set.contains(cur.toString()))
            return cur.toString();
        
        for(int i=0; i<n; i++){
            cur.setCharAt(i, '1');
            helper(set, cur, i, n);
            cur.setCharAt(i, '0');
        }
        
        return null;
    }
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        // Set<String> set = new HashSet<>();
        // StringBuilder cur = new StringBuilder();

        // for(int i=0; i<n; i++){
        //     set.add(nums[i]);
        //     cur.append("0");
        // }

        // String res = helper(set, cur, 0, n);
        // if(res != null)
        //     return res;

        // return "0";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            char c = nums[i].charAt(i);
            if(c == '1')
                sb.append('0');
            else
                sb.append('1');
        }
        return sb.toString();
    }
}
