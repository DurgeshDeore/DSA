class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length, m = matrix[0].length;
        // if(k <= m) return matrix[0][k-1];
        // Brute force: sorting/ pq
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] row: matrix){
            for(int num: row){
                pq.add(num);
            }
        }
        while(!pq.isEmpty() && k > 1){
            pq.poll();
            k -= 1;
        }
        return pq.isEmpty()? -1: pq.poll();

        // Binary Search 
    }
}
