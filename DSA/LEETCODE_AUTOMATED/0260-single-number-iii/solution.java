class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length, j=0;
        // if(n == 2) return nums;
        int[] res = new int[2];
        // approach 1: use HashMap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i: nums) map.put(i, map.getOrDefault(i, 0)+1);
        // for(int k: map.keySet()){
        //     if(map.get(k) == 1) res[j++]=k;
        //     if(j == 2) break;
        // }
        // return res;

        // approach 1: use HashMap
        int xor = 0;
        for(int num: nums) xor ^= num;
        int mask = xor & -xor;
        for(int num: nums){
            if((num&mask) != 0) res[0] ^= num;
            else res[1] ^=num; 
        }
        return res;
    }
}
