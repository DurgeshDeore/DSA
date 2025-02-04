//method = hashing and prefix sum
//better appraoch
class Solution {
    public int findMaxLength(int[] nums) {
        int len=0,sum=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(sum,0);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum-=1;
            }else{
                sum+=1;
            }
            if(sum ==0 ) len=i+1;
            if(map.containsKey(sum)){
                len=Math.max(len,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return len;
    }
}
