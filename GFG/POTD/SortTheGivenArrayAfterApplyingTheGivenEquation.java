class Solution {
    public ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int x: arr){
            int temp = A*x*x +  B*x + C;
            res.add(temp);
        }
        Collections.sort(res);
        return res;
    }
}
