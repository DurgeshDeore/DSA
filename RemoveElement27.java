//method = use inbuit (arrlst)
// optimized solution
class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int ele: nums){
            if(ele != val){
                arr.add(ele);
            }
        }
        int i=0;
        for(int ele: arr){
            nums[i++] = ele;
        }
        return arr.size();
    }
}
