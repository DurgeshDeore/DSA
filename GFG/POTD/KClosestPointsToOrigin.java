class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        for(int i=0;i<points.length; i++){
            int x=points[i][0], y=points[i][1];
            int dist=(x*x)+(y*y);
            pq.add(new int[]{dist,x,y});
            if(pq.size()>k){
                // pq.remove();
                pq.poll();
            }
        }
        int res[][]=new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            res[i][0]=arr[1];
            res[i][1]=arr[2];
            // pq.remove();
            i++;
        }
        return res;
    }
}
