class Solution {
    public String findLargest(int[] arr) {
        int n = arr.length;
        String[] nums = new String[n];
        for(int i=0; i<n; i++) {
            nums[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(nums, (a,b)-> (b+a).compareTo(a+b));
        if (nums[0].equals("0")) return "0";
        StringBuilder res = new StringBuilder();
        for(String s: nums) res.append(s);
        return res.toString();
    }
}
