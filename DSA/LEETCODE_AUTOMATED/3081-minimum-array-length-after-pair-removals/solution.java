class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int maxFreq=0, n=nums.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i ,map.getOrDefault(i, 0)+1);
            maxFreq = Math.max(map.get(i), maxFreq);
        }
        if(maxFreq <= (n/2)){
            if(n%2 == 1) return 1;
            else return 0;
        }   
        return (maxFreq*2)-n;
    }
}
