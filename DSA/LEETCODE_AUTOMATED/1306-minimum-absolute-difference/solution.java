class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++)
            diff = Math.min(diff, arr[i]-arr[i-1]);  

        for(int i=1; i<arr.length; i++){
            if(arr[i]-arr[i-1] == diff){
                // List<Integer> temp = new ArrayList<>();
                // temp.add(arr[i-1]);
                // temp.add(arr[i]);
                res.add(List.of(arr[i-1], arr[i]));
            }
        }
        return res;
    }
}
