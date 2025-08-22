//linear approach use binary
class Solution {
    public int median(int[][] mat) {
        int n=mat.length * mat[0].length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int row[]: mat){
            for(int i: row){
                arr.add(i);
            }
        }
        Collections.sort(arr);
        return arr.get(n/2);
    }
}
