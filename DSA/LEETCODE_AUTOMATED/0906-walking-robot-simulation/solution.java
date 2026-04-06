class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int res = 0;
        int[] pos = {0,0};
        char dir = 'E';
        HashSet<String> set = new HashSet<>();

        for (int[] ob : obstacles) {
            set.add(ob[0] + "," + ob[1]);
        }

        for(int cmd: commands){
            if(cmd == -1){
                if(dir == 'E') dir = 'S';
                else if(dir == 'S') dir = 'W';
                else if(dir == 'W') dir = 'N';
                else if(dir == 'N') dir = 'E';
            }else if(cmd == -2){
                if(dir == 'E') dir = 'N';
                else if(dir == 'N') dir = 'W';
                else if(dir == 'W') dir = 'S';
                else if(dir == 'S') dir = 'E';
            }else{

                for(int i=0; i<cmd; i++){
                    int nx = pos[0];
                    int ny = pos[1];
                    if(dir == 'E') ny += 1;
                    else if(dir == 'W') ny -= 1;
                    else if(dir == 'S') nx += 1;
                    else nx -= 1;

                    if(set.contains(nx + "," + ny))
                        break;

                    pos[0] = nx;
                    pos[1] = ny;
                }
            }

            res = Math.max(res , (pos[0] * pos[0]) + (pos[1] * pos[1]));
        }

        return res;
    }
}
