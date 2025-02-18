class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        for(int i=0;i<points.length;i++){
            int x=points[i][0], y=points[i][1];
            int dist=(x*x)+(y*y);
            pq.add(new int[]{dist,x,y});
            if(pq.size()>k) pq.poll();
        }
        int[][] res=new int[k][2];
        int i=0;
        while(!pq.isEmpty()&&i<k){
            int[] temp=pq.poll();
            res[i][0]=temp[1];
            res[i][1]=temp[2];
            i++;
        }
        return res;
    }
}
