class Solution {
    public boolean canReach(int[] start, int[] target) {
        if(Math.abs(start[0] - target[0])%2 == 1 && Math.abs(start[1] - target[1])%2 == 1) return true;
        if(Math.abs(start[0] + target[0])%2 == 0 && Math.abs(start[1] + target[1])%2 == 0) return true;
        return false;
    }
}
