class Solution {

    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        int ans = 1;
        for(int i=1; i<n ;i++){
            ans = ans * (n-i);
            ans = ans /i;
            res.add(ans);
        }
        return res;
    }
}
