class Solution {
    public List<List<Integer>> threeSum(int[] nums) { // use 2 pointer approach
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        //sort Array
        Arrays.sort(nums); 

        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue; //skip duplicates
            int l=i+1, r=n-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0){
                    r--;
                }else if(sum < 0){
                    l++;
                }else{
                    res.add(new ArrayList<>(List.of(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                    while(l<r && nums[l-1] == nums[l]) l++; //skip duplicates
                    while(l<r && nums[r] == nums[r+1]) r--;
                }
            }
        }
        return res;
    }
}
