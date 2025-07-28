class Solution {
    public int countHillValley(int[] nums) {
        int res=0, i=1, n=nums.length;
        // ArrayList<Integer> arr= new ArrayList<>();
        // arr.add(nums[0]);
        // for(int i=1; i<nums.length; i++) {
        //     if(arr.get(arr.size()-1)!=nums[i]) arr.add(nums[i]);
        // }
        // for(int i=1; i<arr.size()-1; i++){
        //     if((arr.get(i-1)<arr.get(i) && arr.get(i)>arr.get(i+1)) || arr.get(i-1)>arr.get(i) && arr.get(i)<arr.get(i+1)) res++;
        // }
        while(i<n-1){
            int prev=nums[i-1];
            while(prev==nums[i] && i<n-1) i++;
            int cur=nums[i];
            while(cur==nums[i] && i<n-1) i++;
            int nxt=nums[i];
            if((prev<cur && cur>nxt) || prev>cur && cur<nxt) res++;
        }
        return res;
    }
}
