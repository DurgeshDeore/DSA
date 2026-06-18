class Solution {
    public double angleClock(int hour, int minutes) {
        // if(minutes == 0) return 0;
        double mAngle = 6.0 * minutes;
        double hAngle = 30 * (hour%12) + 0.5 * minutes;
        double angle = Math.abs(hAngle - mAngle);
        return Math.min(angle, 360.0-angle);
    }
}
