class Solution {
    public String[] largestString(int[] nums) {
        int indx = 0;
        long val = 1;
        String[] res = new String[nums.length];
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int n: nums){
            StringBuilder sb = new StringBuilder();
            long num = (long) n;
            int zCnt = n>>25;
            for(int i=0; i<zCnt; i++) sb.append('z');
            for (int i = 24; i >= 0; i--) {
                if((num >> i & 1) == 1) {
                    sb.append(chars[i]);
                }
            }
            res[indx++] = sb.toString();
        }
        return res;
    }
}
