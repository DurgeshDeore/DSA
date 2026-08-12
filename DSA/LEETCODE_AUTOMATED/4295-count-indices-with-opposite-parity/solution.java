class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        for(int i=0; i<n-1; i++){
            int parity = 0;
            boolean isEven = (nums[i]%2) == 0;
            for(int j=i+1; j<n; j++){
                if(isEven == true && (nums[j]%2 != 0)) parity += 1;
                if(isEven == false && (nums[j]%2 == 0)) parity += 1;
            }
            res[i] = parity;
        }

        return res;
    }
}
