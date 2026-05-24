class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n=nums.length, cur=nums[0], cnt=1, len=1;
        for(int i=1; i<n; i++){
            if(nums[i] == cur){
                cnt+=1;
                if(cnt > k){
                    nums[i]=-1;
                }else{
                    len+=1;
                }
            }else{
                cur = nums[i];
                cnt =1;
                len+=1;
            }
        }
        int[] res= new int[len];
        int j=0;
        for(int i: nums){
            if(i != -1 && j<len) res[j++] = i;
        }
        return res;
    }
}
