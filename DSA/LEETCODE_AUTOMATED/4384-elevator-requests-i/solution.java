class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int res = requests[0];
        for(int i=1; i<requests.length; i++) res += Math.abs(requests[i-1]-requests[i]);
        return res;
    }
}
