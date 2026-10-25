class Solution {
    public int getMaxVal(int n){
        int[] nums = new int[10];
        while(n != 0){
            nums[n%10] += 1;
            n /= 10;
        }
        int num = 0;
        for(int i=9; i>=0; i--){
            while(nums[i] > 0){
                if(num == 0){
                    num = i;
                }else{
                    num *= 10;
                    num += i;
                }
                nums[i] -= 1;
            }
        }
        return num;
    }
    public long maximizeSum(int[] nums, int k) {
        int n = nums.length;
        long preSum = 0;
        ArrayList<Long> profits = new ArrayList<>();
        
        for(int num: nums){
            preSum += num;
            long curProfit = getMaxVal(num) - num;
            if(curProfit > 0) profits.add(curProfit);
        }

        Collections.sort(profits);

        for(int i=profits.size()-1; k>0 && i>=0; i--, k--) preSum += profits.get(i);

        return preSum;
    }
}
