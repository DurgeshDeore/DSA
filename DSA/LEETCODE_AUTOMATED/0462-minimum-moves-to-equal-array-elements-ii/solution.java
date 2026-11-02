class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length, minMoves = Integer.MAX_VALUE, mod = 1_000_000_007; 
        // brute force
        // for(int i=0; i<n; i++){
        //     int curMoves = 0;
        //     for(int num: nums){
        //         curMoves += Math.abs(nums[i]-num);
        //     }
        //     minMoves = Math.min(minMoves, curMoves);
        // }

        // sort array then find the element from the mid
        Arrays.sort(nums);
        int mid = (n/2), curMoves = 0;
        int l = mid-1, r = mid+1;
        minMoves = 0;
        for(int num: nums) minMoves = minMoves+Math.abs(nums[mid]-num);
        
        // while(l >= 0 && curMoves < minMoves){
        //     curMoves = 0; //reset
        //     for(int num: nums) curMoves += Math.abs(nums[l]-num) % mod;;
        //     l-=1;
        //     minMoves = Math.min(minMoves, curMoves);
        // }

        // curMoves = 0;
        // while(r < n && curMoves < minMoves){
        //     curMoves = 0; //reset
        //     for(int num: nums) curMoves += Math.abs(nums[r]-num) % mod;;
        //     r+=1;
        //     minMoves = Math.min(minMoves, curMoves);
        // }

        return minMoves;
    }
}
