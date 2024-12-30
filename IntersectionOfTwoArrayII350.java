//method use hashmap
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans= new ArrayList<>();
        for(int ele: nums1){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        for(int ele: nums2){
            if(map.containsKey(ele) && map.get(ele) > 0){
                ans.add(ele);
                map.put(ele,map.get(ele)-1);
            }
        }
        int[] res = new int[ans.size()];
        int i=0;
        for(int ele: ans){
            res[i++]=ele;
        }
        return res;
    }
}
