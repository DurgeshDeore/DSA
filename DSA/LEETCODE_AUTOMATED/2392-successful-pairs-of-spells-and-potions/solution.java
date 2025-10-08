class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length, m=potions.length, indx=0;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            int cur = spells[i];
            int left = 0, right = m-1;
            int cnt=m;
            while(left <= right){
                int mid = (left+right)/2;
                if((long)cur*potions[mid] >= success){
                    cnt = mid;
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            res[indx++] = m-cnt;
        }
        return res;
    }
}
