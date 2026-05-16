class Solution {
    public ArrayList<Integer> lst =new ArrayList<>();
    public void helper(int n){
        if(n >= 10){
            helper(n/10);
        }
        lst.add(n%10);
    }
    public int[] separateDigits(int[] nums) {
        for(int i: nums){
            helper(i);
        }
        if(lst.size() == nums.length) return nums;
        int[] res = new int[lst.size()];
        for(int i=0; i<lst.size(); i++) res[i] = lst.get(i);
        return res;
    }
}
