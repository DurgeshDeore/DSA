class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> arr = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int f: friends) set.add(f);
        for(int o: order){
            if(set.contains(o)) arr.add(o);
        }
        int n=arr.size(), i=0;
        int[] res = new int[n];
        for(int j: arr) res[i++]=j;
        return res;
    }
}
