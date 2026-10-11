class Solution {
    public int getGcd(int x, int y){
        while(y != 0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }
    public boolean canMeasureWater(int x, int y, int target) {
        if(x+y < target) return false;
        int gcd = getGcd(x, y);
        if(gcd == 0) return target == 0;
        return target%gcd == 0;
    }
}
