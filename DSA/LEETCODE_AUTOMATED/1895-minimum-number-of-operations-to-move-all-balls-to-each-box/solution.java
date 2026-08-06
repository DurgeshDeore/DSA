class Solution {
    public int[] minOperations(String boxes) {
        int n =boxes.length();
        int[] res = new int[n];
        // approach 1: Brute Force 
        ArrayList<Integer> onesPos = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(boxes.charAt(i) == '1') onesPos.add(i);
        }
        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int pos: onesPos){
                sum += Math.abs(pos-i);
            }
            res[i] = sum;
        }
        return res;
    }
}
