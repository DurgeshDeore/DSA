class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        // approach 1: countig odd even then merge
        int n=nums.length;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int num: nums){
            if(num%2 == 0) even.add(num);
            else odd.add(num);
        }
        for(int i=0; i<n; i++){
            if(i%2==0){
                nums[i] = even.get(0);
                even.remove(0);
            } else {
                nums[i] = odd.get(0);
                odd.remove(0);
            }
        }
        // approach 2: two pointers
        // int l=0, r=nums.length-1;
        // while(l<r){
        //     if(l%2==0 && r%2!=0 && (nums[l]%2 !=0) && (nums[r]%2 == 0)){    //swap
        //         int t = nums[l];
        //         nums[l] = nums[r];
        //         nums[r] = t;
        //         l+=1;
        //         r-=1;
        //     }
        //     while(l<r && (l%2==0 && nums[l]%2 ==0)) l+=1;
        //     while(l<r && (r%2!=0 && nums[r]%2 !=0)) r-=1;
        // }
        return nums;
    }
}
