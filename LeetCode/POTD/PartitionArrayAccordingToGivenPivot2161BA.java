//14.35
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int ele: nums){
            if(ele<pivot){
                left.add(ele);
            }else if(ele==pivot){
                mid.add(ele);
            }else{
                right.add(ele);
            }
        }
        int[] res=new int[left.size()+right.size()+mid.size()];
        int i=0;
        for(int ele: left) res[i++]=ele;
        for(int ele: mid) res[i++]=ele;
        for(int ele: right) res[i++]=ele;
        return res;
    }
}
