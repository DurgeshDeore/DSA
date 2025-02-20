class Solution{
	public static int kthSmallest(int[][]mat,int n,int k){
        if(k>(n*n)) return -1;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pq.add(mat[i][j]);
            }
        }
        while(k>1){
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}
