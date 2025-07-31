class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res= new HashSet<>();
        Set<Integer> prev= new HashSet<>();
        for(int i=0; i<arr.length; i++){
            Set<Integer> cur= new HashSet<>();
            cur.add(arr[i]);
            for(int n: prev){
                cur.add(n|arr[i]);
            }
            prev=cur;
            res.addAll(prev);
        }
        return res.size();
    }
}
