class Solution {
    public int maxOperations(int[] nums, int k) {
        int opr=0, n=nums.length;
        Arrays.sort(nums);
        // List<Integer> res = new ArrayList<>();
        // HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    
        // for(int i: nums) map.put(i, new ArrayList<>());
        // for(int i=0; i<n; i++) map.get(nums[i]).add(i);

        // for(int i: nums){
        //     if(map.containsKey(k-i)){
        //         int s1 = map.get(i).size(), s2 = map.get(k-i).size();
        //         if(s1 > 0 && s2 > 0){
        //             opr += 1;
        //             map.get(i).remove(0);
        //             map.get(k-i).remove(0);
        //         }
        //     }
        // }
        // return opr;

        int l=0, r=n-1;
        while(l<r){
            int sum = nums[l]+nums[r];
            if(sum == k){
                opr+=1;
                l++;
                r--;
            }else if(sum > k){
                r--;
            }else {
                l++;
            }
        }
        return opr;
    }
}
