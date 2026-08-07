class Solution {
    public int revFun(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public int countNicePairs(int[] nums) {
        int n = nums.length, pairs = 0;
        int mod = 1_000_000_007;
        // approach 1: Brute force - create new rev nums & cnt pairs
        // TLE (76/84) 
        // approach 2: Use hashing use mod
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = nums[i] - revFun(nums[i]);
            if (map.containsKey(val)) {
                pairs = (pairs+ map.get(val)) % mod;
            }
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return pairs;
    }
}
