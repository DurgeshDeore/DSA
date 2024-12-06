class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length > nums2.length? nums1.length: nums2.length;
        ArrayList<Integer> arrlst = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele: nums1){
            set.add(ele);
        }
        for(int ele: nums2){
            if(set.contains(ele)){
                set.remove(ele);
                arrlst.add(ele);
            }
        }
        int arr[] = new int[arrlst.size()];
        for(int i=0; i<arrlst.size(); i++){ 
            arr[i]=arrlst.get(i);
        }
        return arr;
    }
}
