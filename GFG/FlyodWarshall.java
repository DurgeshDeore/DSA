
class Solution {
    public void floydWarshall(int[][] dist) {
        for(int via = 0; via<dist.length; via++){
            for(int i=0; i<dist.length; i++){
                for(int j=0; j<dist[0].length; j++){
                    if(dist[i][via] != 100000000 &&dist[via][j] != 100000000){
                        dist[i][j] = Math.min(dist[i][j], dist[i][via]+dist[via][j]);
                    }
                }
            }
        }
    }
}
