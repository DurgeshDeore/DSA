class Solution {
    public int isPeek(int num){
        ArrayList<Integer> list = new ArrayList<>();
        while(num != 0){
            list.add(num%10);
            num /= 10;
        }
        if(list.size() <= 2) return 0;
        int n=list.size(), peek=0, valley=0;
        for(int i=1; i<n-1; i++){
            if(list.get(i-1) < list.get(i) && list.get(i) > list.get(i+1)) peek += 1;
            else if(list.get(i-1) > list.get(i) && list.get(i) < list.get(i+1)) valley += 1;
        }
        return peek +valley;
    }
    public int totalWaviness(int num1, int num2) {
        int res = 0;
        for(int i=num1; i<=num2; i++){
            res += isPeek(i);
        }
        return res;
    }
}
