class Solution {
    public boolean checkIfExist(int[] nums) {
        // approach 1: Brute force
        // approach 2: Use hash set
        // Arrays.sort(nums, Collections.reverseOrder());
        HashSet<Integer> seen = new HashSet<>();
        for(int num: nums){
            if(seen.contains(num*2) || (num%2 == 0 && seen.contains(num/2))) return true;
            // else if(seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }
}
