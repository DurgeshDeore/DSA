class BusBooking {
    public int totalTime;
    public int n;
    public int minTime;
    public boolean[][] tickets;
    public int[][] cost;
    public BusBooking(int n) {
        this.n = n;
        minTime = 0;
        totalTime = 0;
        tickets = new boolean[n+1][4];
        cost = new int[n+1][4];
    }
    
    public void toggle(String seat) {
        int row = Integer.parseInt(seat.substring(1));
        int col = seat.charAt(0)-'A';
        if(tickets[row][col]){
            totalTime -= cost[row][col];
            minTime -= 1;
            cost[row][col] = 0;
            tickets[row][col] = false;
        }else{
            int time = 1;
            if(col != 1 && col != 2){
                int adj = (col==0)? 1: 2;
                if(tickets[row][adj]) time = 3;
            }
            cost[row][col] = time;
            totalTime += cost[row][col];
            minTime += 1;
            tickets[row][col] = true;
            
        }
    }
    
    public int getTotalTime() {
        return totalTime;
    }
    
    public int getMinTime() {
        // int minTime = 0;
        // for(int i=1; i<=n; i++){
        //     if(tickets[i][0]) minTime += 1;
        //     if(tickets[i][1]) minTime += 1;
        //     if(tickets[i][2]) minTime += 1;
        //     if(tickets[i][3]) minTime += 1;
        // }
        return minTime;
    }
}

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */
