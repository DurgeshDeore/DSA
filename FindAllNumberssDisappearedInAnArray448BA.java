//method = hashing
//better appraoh
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums.length == 0){
            return new ArrayList<>();
        }
        List<Integer> res=new ArrayList<>();
        int n=1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums) map.put(num,1);
        while(n <= nums.length){
            if(!map.containsKey(n)) res.add(n);
            n++;
        }
        return res;
    }
}
