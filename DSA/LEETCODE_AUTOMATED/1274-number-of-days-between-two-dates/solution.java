class Solution {
    public int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public boolean isLeapYr(int yr){
        if((yr%4 == 0 && yr%100 != 0) || (yr%400 == 0)) return true;
        return false;
    }
    public int getDays(String date){
        int yr = Integer.parseInt(date.substring(0, 4));
        int m = Integer.parseInt(date.substring(5, 7));
        int d = Integer.parseInt(date.substring(8)); 
        int days = 0;
        for(int curYr=1900; curYr<yr; curYr++){
            days += isLeapYr(curYr)? 366: 365;
        }
        for(int i=1; i<m; i++){
            if(i == 2 && isLeapYr(yr)) days += 29;
            else days += months[i-1];
        }
        days += d;
        return days;
    }
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(getDays(date1) - getDays(date2));
    }
}
