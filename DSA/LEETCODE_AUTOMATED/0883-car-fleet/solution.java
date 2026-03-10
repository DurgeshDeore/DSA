class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        // double[][] temp = new double[n][2];
        PriorityQueue<double[]> pq = new PriorityQueue<>((a,b) -> 
            Double.compare(b[0], a[0])
        );
        for(int i=0; i<n; i++){
            double[] temp = new double[2];
            temp[0] = position[i];
            temp[1] = (double)(target- position[i]) / speed[i];
            pq.add(temp);
        }

        // Arrays.sort(temp, (a,b) -> {
        //     return b[0]-a[0];
        // });

        int res=0;
        double prevTime=0;
        // for(int i=0; i<n; i++){
        //     double curTime = temp[i][1];
        //     if(curTime > prevTime){
        //         res += 1;
        //         prevTime = curTime;
        //     }
        // }
        while(!pq.isEmpty()){
            double curTime = pq.poll()[1];
            if(curTime > prevTime){
                res += 1;
                prevTime = curTime;
            }
        }
        return res;
    }
}
