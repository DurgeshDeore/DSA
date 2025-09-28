class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> lst = new ArrayList<>();
        int des=1;
        while(n!=0){
            int ld = n%10;
            n /= 10;
            if(ld*des != 0) lst.add(ld*des);
            des*=10;
        }
        int len=lst.size();
        int[]res = new int[len];
        int j=0;
        for(int i=len-1; i>=0; i--){
            res[j++] = lst.get(i);
        }
        return res;
    }
}
