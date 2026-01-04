class Solution {
    public int[] noOfDivisor(int n) {
        int[] res = new int[2];

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) { 
                    res[0] += 1;
                    res[1] += i;
                } else {
                    res[0] += 2;
                    res[1] += i + (n / i);
                }
            }
        }
        return res;
    }

    public int sumFourDivisors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long res = 0;
        for (int i : nums) {
            if (map.containsKey(i)) {
                res += map.get(i);
            } else {
                int cnt[] = noOfDivisor(i);
                if (cnt[0] == 4) {
                    map.put(i, cnt[1]);
                    res += cnt[1];
                }
            }
        }
        return (int) res;
    }
}
