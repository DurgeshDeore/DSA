class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> lst = new HashSet<>();
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();

        for(int i: nums1) n1.add(i);
        for(int i: nums2) n2.add(i);

        for(int i: nums1){
            if(!n2.contains(i)) lst.add(i);
        }
        List<Integer> temp = new ArrayList<>();
        for(int i: lst) temp.add(i);
        res.add(temp);

        temp = new ArrayList<>();
        lst = new HashSet<>();
        for(int i: nums2){
            if(!n1.contains(i)) lst.add(i);
        }
        for(int i: lst) temp.add(i);
        res.add(temp);
        
        return res;
    }
}
