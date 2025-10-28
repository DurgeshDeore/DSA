class Solution {
    public ArrayList<ArrayList<Integer>> kSmallestPair(int[] arr1, int[] arr2, int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            (arr1[a[0]] + arr2[a[1]]) - (arr1[b[0]] + arr2[b[1]])
        );
        
        for(int i=0; i<arr1.length && i<k; i++)
            pq.add(new int[]{i, 0});
        
        while(k-- > 0 && !(pq.isEmpty()) ){
            int cur[] = pq.poll();
            int i=cur[0], j=cur[1];
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(arr1[i]);
            temp.add(arr2[j]);
            res.add(temp);

            if(j+1 < arr2.length){
                pq.add(new int[]{i, j+1});
            }
        }
        return res;
    }
}
