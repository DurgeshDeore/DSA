class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] temp = new String[n];
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<n; i++)
            temp[i] = String.valueOf(nums[i]);
        
        Arrays.sort(temp, (a,b) -> (b+a).compareTo(a+b));

        if(temp[0].charAt(0) == '0') return "0";

        for(String s: temp)
            sb.append(s);
        
        return sb.toString();
    }
}
