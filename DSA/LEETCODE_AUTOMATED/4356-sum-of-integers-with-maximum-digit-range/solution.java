class Solution {
    // helper function to get range
    public int getRange(int num){
        int maxIndx = Integer.MIN_VALUE, minIdx = Integer.MAX_VALUE;
        while(num != 0){
            int ld = num%10;
            num /= 10;
            minIdx = Math.min(minIdx, ld);
            maxIndx = Math.max(maxIndx, ld);
        }
        return maxIndx-minIdx;
    }
    
    public int maxDigitRange(int[] nums) {
        // initlize var
        int maxRange = Integer.MIN_VALUE, resSum=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1]-b[1]);
        
        // traverse and find the max ragne and store in pq
        for(int num: nums){
            int curRange = getRange(num);
            pq.add(new int[]{num, curRange});
            maxRange = Math.max(maxRange, curRange);
        }
        
        // poll the elemet and add into resSum 
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            if(cur[1] == maxRange) resSum += cur[0];
        }
        
        // return result
        return resSum;
    }
}
