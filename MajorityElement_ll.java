//method = use of inbuil ds HashMap, Set
//not optimized approach
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int n=nums.length;
        //List<Integer> lst = new ArrayList<>();
        Set<Integer> lst = new TreeSet<>();
        if(n==0){ return new ArrayList<>(); }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
            if(map.get(ele)>(n/3)){
                if(!lst.contains(ele)){
                    lst.add(ele);
                }
            }
        }
        return new ArrayList<>(lst);
    }
}
