class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n=nums.length;
        if(k==0) return nums;
        ArrayList<Integer> pos= new ArrayList<>();
        for(int i: nums){
            if(i>=0) pos.add(i);
        }
        int m=pos.size();
        if(m==0 || m==k) return nums;
        int j=(k<m)? k: k%m;
        for(int i=0; i<n; i++){
            if(nums[i] >= 0){
                if(j < m){
                    nums[i] = pos.get(j);
                }else{
                    j=0;
                    nums[i] = pos.get(j);
                }
                j++;
            }
        }
        // nums[0] = 2/3;
        return nums;
    }
}
