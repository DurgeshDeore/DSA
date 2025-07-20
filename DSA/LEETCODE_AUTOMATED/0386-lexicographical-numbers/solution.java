class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=1; i<=n; i++) res.add(i);
        Collections.sort(res, (a,b)->{
            String aa = Integer.toString(a);
            String bb = Integer.toString(b);
            return aa.compareTo(bb);
        });
        return res;
    }
}
