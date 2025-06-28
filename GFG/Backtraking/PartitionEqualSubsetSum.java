class Solution {
    static boolean util(int[] arr, ArrayList<Integer> left, ArrayList<Integer> right, int lsum, int rsum, int i){
        if(i == arr.length) return lsum == rsum;
        left.add(arr[i]);
        if(util(arr, right, left, lsum + arr[i], rsum, i+1)) return true;
        left.remove(left.size()-1);
        right.add(arr[i]);
        
        if(util(arr, right, left, lsum, rsum + arr[i], i+1)) return true;
        right.remove(right.size()-1);
        return false;
    }
    static boolean equalPartition(int arr[]) {
        int n = 0;
        for(int i: arr) n+=i;
        if(n%2 != 0) return false;
        return util(arr, new ArrayList<>(), new ArrayList<>(), 0, 0, 0);
    }
}
