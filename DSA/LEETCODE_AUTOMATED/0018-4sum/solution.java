class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //similar to 3 sum 
        int n=nums.length;
        List<List<Integer>> quadruplets = new ArrayList<>();

        //sort array
        Arrays.sort(nums);

        for(int i=0; i<n-3; i++){
            if(i>0 && nums[i-1] == nums[i]) continue; //skip
            for(int j=i+1; j<n-2; j++){
                if(j>i+1 && nums[j-1] == nums[j]) continue; //skip
                int l=j+1, r=n-1;
                while(l<r){
                    long sum = (long)nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum == target){
                        quadruplets.add(new ArrayList<>(List.of(nums[i],nums[j],nums[l],nums[r])));
                        l++;
                        r--;
                        while(l<r && nums[l] == nums[l-1]) l++; //skip
                        while(l<r && nums[r] == nums[r+1]) r--; //skip
                    }else if(sum < target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }

        return quadruplets;
    }
}
