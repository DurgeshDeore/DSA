class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length, br=-1;
        // find breakinng point
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]) {
                br=i;
                break;
            }
        }
        if(br != -1){ 
            // find and swap the nearest lagest val;
            for(int i=n-1; i>=0; i--){
                if(nums[i] > nums[br]){ // swap
                    int temp = nums[i];
                    nums[i] = nums[br];
                    nums[br] = temp;
                    break;
                }
            }
            // reverse the all values from the 
            int l = br+1, r=n-1;
            while(l<r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }else{ // no. breaking point then sort and return 
            Arrays.sort(nums);
        }
    }
}
