class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]+nums[1] <= nums[2]) return "none";
        Set<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        if(set.size() == 1) return "equilateral";
        if(set.size() == 2) return "isosceles";
        return "scalene";
    }
}
