class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length, r=1;
        int[] temp = Arrays.copyOf(arr, n);
        Arrays.sort(temp);
        HashMap<Integer, Integer> ranks = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!ranks.containsKey(temp[i]))
                ranks.put(temp[i], r++);
        }
        for(int i=0; i<n; i++){
            temp[i] = ranks.get(arr[i]);
        }
        return temp;
    }
}
