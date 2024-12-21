class Solution {
    public int removeElement(int[] nums, int val) {
        //HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int ele: nums){
            if(ele != val){
                //map.put(ele,map.getOrDefault(ele,0)+1);
                arr.add(ele);
            }
        }
        int i=0;
        // for(int ele: map.keySet()){
        //     nums[i++] = ele;
        // }
        for(int ele: arr){
            nums[i++] = ele;
        }
        // while(i<nums.length){
        //     nums[i++]=0;
        // }
        return arr.size();
    }
}
