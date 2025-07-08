class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> cur = new ArrayList<>();
            for(int j=0; j<i+1; j++){
                if(j==0 || j==i){
                    cur.add(1);
                }else{
                    List<Integer> prev=res.get(i-1);
                    cur.add(prev.get(j-1) + prev.get(j));
                }
                
            }
            res.add(cur);
        }
        return res;
    }
}
