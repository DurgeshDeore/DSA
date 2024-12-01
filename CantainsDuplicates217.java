//method = use inbuilt ds
//better approach
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for(int ele :nums){
            if(!temp.add(ele)){
                return true;
            }
        }
        return false;
    }
}
