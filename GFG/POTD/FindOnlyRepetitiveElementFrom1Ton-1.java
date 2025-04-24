class Solution {
    public int findDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int ele: arr){
            if(set.contains(ele)){
                return ele;
            }
            set.add(ele);
        }
        return -1;
    }
}
