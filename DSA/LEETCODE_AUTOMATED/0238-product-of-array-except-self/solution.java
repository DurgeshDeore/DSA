class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, cur = 1;;
        int prod[] = new int[n];
        Arrays.fill(prod, 1);
        
        for(int i=0; i<n ; i++){
            prod[i] *= cur;
            cur *= nums[i];
        }
        cur=1;
        for(int i= n-1; i>= 0 ; i--){
            prod[i] *= cur;
            cur *= nums[i];
        }
        return prod;
    }
}
