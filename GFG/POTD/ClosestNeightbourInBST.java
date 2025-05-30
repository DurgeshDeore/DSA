class Solution {
    int res = -1;
    public int findMaxFork(Node root, int k) {
        if(root == null){
            return res;
        }
        res = (res <= root.data && root.data <= k) ? root.data: res;
        findMaxFork(root.right, k);
        findMaxFork(root.left, k);
        return res;
    }
}
