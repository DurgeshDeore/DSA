//use inbiult ds HashMap
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        if(n==0){ return -1; }
        if(n==1){ return nums[0]; }
        for(int ele: nums){
            map.put(ele, map.getOrDefault(ele,0)+1); //getOrDefault returns value if exist otherwise set default value
            if(map.get(ele)>(n/2)){ //find majority element and return it
                return ele; 
            }
        }
        return -1;
    }
}
