// User function template for JAVA

class Solution {
    static void util(int[] arr, ArrayList<ArrayList<Integer>> res, int rem, int i, ArrayList<Integer> cur){
        if(rem == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(rem < 0 || i >= arr.length) return;
        cur.add(arr[i]);
        util(arr, res, rem-arr[i], i, cur);
        cur.remove(cur.size()-1);
        util(arr, res, rem, i+1, cur);
    }
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        util(arr, res, target, 0, new ArrayList<>());
        return res;
    }
}
