class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] temp = Arrays.copyOf(nums, n);
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(temp);
        for(int i=0; i<n; i++) {
            if(!map.containsKey(temp[i])) map.put(temp[i], i);
        }
        for(int i=0; i<n; i++) temp[i] = map.get(nums[i]);
        return temp;
    }
}
