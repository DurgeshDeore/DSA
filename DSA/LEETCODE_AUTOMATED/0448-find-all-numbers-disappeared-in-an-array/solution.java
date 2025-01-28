class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums.length == 0){
            return new ArrayList<>();
        }
        // better apprroach
        List<Integer> res=new ArrayList<>();

        // cycle sort
        // sort
        int i=0;
        while(i<nums.length){
            int curr=nums[i]-1;
            if(nums[i] != nums[curr]){
                nums[curr] ^= nums[i];
                nums[i] ^= nums[curr];
                nums[curr] ^= nums[i];
            }else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                res.add(i+1);
            }
        }
        return res;
    }
}
