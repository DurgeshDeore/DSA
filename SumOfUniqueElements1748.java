//method = use inbuilt ds hashmapclass Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>(); 
        int sum=0;
        for(int ele: nums){
            map.put(ele,map.getOrDefault(ele,0)+1); //count frequency
        }
        for(int ele: map.keySet()){
            if(map.get(ele)==1){ //find unique elements
                sum+=ele; //add element + sum
            }
        }
        return sum; //return sum
    }
}
