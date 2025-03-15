//100%
class Solution {
    int cnt=0;
    public int numberOfSteps(int num) {
        if(num == 0) return cnt;
        cnt++;
        return num%2==0? numberOfSteps(num/2): numberOfSteps(num-1);
    }
}
