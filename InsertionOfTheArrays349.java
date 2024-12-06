//method= use inbuilt ds hashset, arraylist
//better approach
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrlst = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele: nums1){
            set.add(ele);
        }
        for(int ele: nums2){
            if(set.contains(ele)){
                set.remove(ele); //remove ele
                arrlst.add(ele); //add to arrlst
            }
        }
        int arr[] = new int[arrlst.size()];
        for(int i=0; i<arrlst.size(); i++){ 
            arr[i]=arrlst.get(i); //convert arrlst to arr[]
        }
        return arr;
    }
}
