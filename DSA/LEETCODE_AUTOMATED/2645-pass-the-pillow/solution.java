class Solution {
    public int passThePillow(int n, int time) {
        int i=1;
        boolean flag=true;
        while(time != 0){
            if(flag) i++;
            if(!flag) i--;
            if(i==n) flag=false;
            if(i==1) flag=true;
            time--;
        }
        return i;
    }
}
