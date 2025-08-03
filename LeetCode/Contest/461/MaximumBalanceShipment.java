class Solution {
    public int maxBalancedShipments(int[] weight) {
        int n = weight.length, i = 0, max=Integer.MIN_VALUE, res=0;
        while (i < n) {
            max = Math.max(max, weight[i]);
            if (max > weight[i]) {
                res++;
                max=Integer.MIN_VALUE;
            }
            i++;
        }
        return res;
    }
}
