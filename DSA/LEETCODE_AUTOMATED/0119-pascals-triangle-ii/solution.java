class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<i+1; j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    List<Integer> prev=res.get(i-1);
                    row.add(prev.get(j-1) + prev.get(j));
                }
                
            }
            res.add(row);
        }
        return res.get(rowIndex);
    }
}
