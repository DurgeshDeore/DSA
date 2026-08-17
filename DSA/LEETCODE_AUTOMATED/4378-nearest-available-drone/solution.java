class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        // use pq
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]) return a[1]-b[1]; //index
            return a[0]-b[0];
        });
        for(int i=0; i < drones.length; i++){
            int manDist = Math.abs(drones[i][0]-target[0]) + Math.abs(drones[i][1]-target[1]);
            if(manDist <= drones[i][2]) pq.add(new int[]{manDist, i});
        }
        return pq.isEmpty()? -1: pq.poll()[1];
    }
}
