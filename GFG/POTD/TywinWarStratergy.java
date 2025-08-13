class Solution {
    public int minSoldiers(int[] arr, int k) {
        int lucky=0, res=0, need=(arr.length+1)/2;
        ArrayList<Integer> cost=new ArrayList<>();
        for(int s: arr){
            if(s%k==0) lucky++;
            else cost.add(k-(s%k));
        }
        if (lucky >= need) return 0;
        Collections.sort(cost);
        for(int c: cost){
            res+=c;
            lucky++;
            if(lucky >= need) break;
        }
        return res;
    }
}
